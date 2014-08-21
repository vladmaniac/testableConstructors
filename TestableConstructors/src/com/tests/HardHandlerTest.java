/**
 * 
 */
package com.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.house.EstateHandler;

/**
 * @author vlad.maniac
 *
 */
@SuppressWarnings("unused")
public class HardHandlerTest {

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
	public void test() {
		// Even the constructor is parameterless, it is still full of dependencies
		// and forces us to work with real data
		EstateHandler handler = new EstateHandler();
	}

}
