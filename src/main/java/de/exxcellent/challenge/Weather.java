package de.exxcellent.challenge;

import java.io.IOException;

public class Weather {

	public static String analyseData(String file) throws IOException {
		
		/** read file and return table */
		DataTable table = new DataTable();
		table.readFile(file);
		
		/** calculate the day with the smallest temperature spread */
		String smallestDifference = DataAnalyser.calculateSmallestDifference(table, 1, 2);
		
		return smallestDifference;
	}
	
}
