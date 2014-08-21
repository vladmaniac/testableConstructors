/**
 * 
 */
package com.house;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;

/**
 * @author vlad.maniac
 *
 */
public class EstateHandler {

	Socket socket;

	/**
	 * Handles operations relevant to the whole estate
	 * Problem: Directly reading flag values in a constructor
	 */
	public EstateHandler() {
		InetSocketAddress addr = new InetSocketAddress("http://mach.de", 8181);
		final Proxy FLAG_PORT = new Proxy(Proxy.Type.HTTP, addr);
		socket = new Socket(FLAG_PORT);
	}
	
	// Having an init method does not help at all because at some point
	// we will have a server to handle this code and read from config file
	// At that point, this method is a black box and lives in the setup module of the tests
	void initialize() {
		InetSocketAddress addr = new InetSocketAddress("http://mach.de", 8181);
		final Proxy FLAG_PORT = new Proxy(Proxy.Type.HTTP, addr);
		socket = new Socket(FLAG_PORT);
	}

	/**
	 * Handles operations relevant to the whole estate
	 * Not forcing you to work with real data
	 * 
	 * @param socket
	 */
	public EstateHandler(Socket socket) {
		this.socket = socket;
	}

	/**
	 * Socket provider
	 * 
	 * @param proxy
	 * @return new socket
	 */
	Socket getSocket(Proxy proxy) {
		return new Socket(proxy);
	}
}
