/**
 * 
 */
package com.tests;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.house.EstateHandler;

/**
 * @author vlad.maniac
 *
 */
@SuppressWarnings("unused")
public class EasyHandlerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEstateHandler() {
		InetSocketAddress addr = new InetSocketAddress("http://mach.de", 8181);
		final Proxy FLAG_PORT = new Proxy(Proxy.Type.HTTP, addr);
		Socket testSocket = new Socket(FLAG_PORT);
		EstateHandler handler = new EstateHandler(testSocket);

		// ...
	}
}
