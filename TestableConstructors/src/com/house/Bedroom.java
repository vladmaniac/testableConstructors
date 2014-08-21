/**
 * 
 */
package com.house;

/**
 * @author vlad.maniac
 *
 */
public class Bedroom {
	private String bed;
	private boolean hasTable;

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public boolean isHasTable() {
		return hasTable;
	}

	public void setHasTable(boolean hasTable) {
		this.hasTable = hasTable;
	}

	// Explicit construction
	public Bedroom(String bed, boolean hasTable) {
		this.setBed(bed);
		this.setHasTable(hasTable);
	}
}
