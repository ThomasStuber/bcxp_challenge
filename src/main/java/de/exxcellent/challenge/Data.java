package de.exxcellent.challenge;

import java.io.IOException;

/**
 * Class for Weather and Football to store the table and the item with the minimum difference,
 * contains method that triggers reading the file and calculating the item with minimum difference between two columns
 */

public class Data {
	
	private String minimumItem;
	
	private DataTable table;
	
	public Data() {
		this.table = new DataTable();
	}
	
	public String getMinimum() {
		return this.minimumItem;
	}
	
	/**
	 * Reads and stores file in table, calculates and stores item with smallest difference between two columns
	 * 
	 * @param file - file to be read
	 * @param column1 - first column of interest
	 * @param column2 - second column of interest
	 * @throws IOException
	 */
	public void analyseData(String file, int column1, int column2) throws IOException {
		
		// read file into table
		this.table.readFile(file);
		
		// calculate smallest absolute difference between two columns and return item
		String smallestDifference = DataAnalyser.calculateSmallestDifference(table, column1, column2);
		
		this.minimumItem = smallestDifference;
	}

}