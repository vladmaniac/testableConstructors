/**
 * 
 */
package com.house;

/**
 * @author vlad.maniac
 *
 */
public class Kitchen {
	private String color;
	private int numberOfChairs;

	public String getColour() {
		return color;
	}

	public void setColour(String colour) {
		this.color = colour;
	}

	public int getNumberOfChairs() {
		return numberOfChairs;
	}

	public void setNumberOfChairs(int numberOfChairs) {
		this.numberOfChairs = numberOfChairs;
	}

	// Explicit construction
	public Kitchen(String color, int numberOfChairs) {
		this.color = color;
		this.numberOfChairs = numberOfChairs;
	}
}
