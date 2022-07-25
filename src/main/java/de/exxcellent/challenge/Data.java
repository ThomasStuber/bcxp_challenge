package de.exxcellent.challenge;

import java.io.IOException;

public class Data {
	
	private String minimumDiff;
	
	public String getMinimum() {
		return this.minimumDiff;
	}
	
	/**
	 * Reads file, calculates smallest difference between two columns and stores result
	 * 
	 * @param file - file to be read
	 * @param column1 - first column of interest
	 * @param column2 - second column of interest
	 * @throws IOException
	 */
	public void analyseData(String file, int column1, int column2) throws IOException {
		
		/** read file and return table */
		DataTable table = new DataTable();
		table.readFile(file);
		
		/** calculate smallest absolute difference between two columns */
		String smallestDifference = DataAnalyser.calculateSmallestDifference(table, column1, column2);
		
		this.minimumDiff = smallestDifference;
	}

}