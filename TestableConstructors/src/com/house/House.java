/**
 * 
 */
package com.house;

/**
 * @author vlad.maniac
 *
 */
public class House {
	// Not OK Collaborators
	private Kitchen kitchen = new Kitchen("blue", 4);
	public Bedroom bedroom;

	// OK Collaborators
	Kitchen goodKitchen;
	Bedroom goodBedroom;

	/**
	 * Do something in this parameterless constructor
	 */
	public House() {
		// TODO Auto-generated constructor stub
		bedroom = new Bedroom("matrimonial", false);
	}

	/**
	 * Better construction approach
	 * No instances here
	 * @param k
	 * @param b
	 */
	public House(Kitchen k, Bedroom b) {
		goodKitchen = k;
		goodBedroom = b;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

	public static House getInstance() {
		// House with a bedroom but no kitchen
		return new House();
	}
}
