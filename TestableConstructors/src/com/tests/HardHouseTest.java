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

/**
 * @author vlad.maniac
 *
 */
public class HardHouseTest {

	/**
	 * @throws java.lang.Exception
	@Before
	 */
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorReallyHard() {
		House house = new House();
		// XXX: We cannot test instance of kitchen
		// Kitchen otherKitchen = new Kitchen("red", 3);
		assertTrue(house.getKitchen().getNumberOfChairs() == 4);
		assertTrue(house.getKitchen().getColour().equals("blue"));

		// XXX: Question - Can you calculate the coverage for class House of this single test?
		// How hard is it for you?
	}

	@Test
	public void testViolatingLawOfDemeter() {
		final String EXPECTED_BED = "matrimonial";
		Bedroom bedroom;

		// Excessive dependencies and mixes object lookup with assignment
		bedroom = House.getInstance().bedroom;

		// Bedroom is created in House, which is production data
		assertTrue(bedroom.getBed().equals(EXPECTED_BED));
	}
}
