/**
 * 
 */
package com.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.house.Bedroom;
import com.house.House;
import com.house.Kitchen;

/**
 * @author vlad.maniac
 *
 */
public class EasyHouseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorReallyEasy() {
		final String BED_EXISTANCE = "yes"; 

		// These are "test doubles" - now House house lives only here
		Kitchen dummyKitchen = new Kitchen("red", 8);
		Bedroom dummyBedroom = new Bedroom("yes", false);

		House house = new House(dummyKitchen, dummyBedroom);

		// Better testing coverage than HardHouseTest.java
		// Also demonstrating test doubles
		// Production not affected by testing
		assertFalse(house.getKitchen().getNumberOfChairs() == 8);
		assertTrue(dummyKitchen.getNumberOfChairs() == 8);

		assertFalse(house.getKitchen().getColour().equals("red"));
		assertTrue(dummyKitchen.getColour().equals("red"));
		assertFalse(dummyKitchen.getColour().equals("blue"));

		assertTrue(dummyBedroom.getBed().equals(BED_EXISTANCE));
		// more assertions, more coverage
	}

	@Test
	public void testNotViolatingLawOfDemeter() {
		final String EXPECTED_BED = "small";

		Bedroom dummyBedroom = new Bedroom("small", true);

		// Bedroom is created in House, which is production data
		assertTrue(dummyBedroom.getBed().equals(EXPECTED_BED));
	}
}
