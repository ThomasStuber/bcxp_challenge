package de.exxcellent.challenge;

import java.io.IOException;

public class Football {
	
	public static String analyseData(String file) throws IOException {
		
		// read file
		DataTable table = new DataTable();
		table.readFile(file);
		
		// calculate smallest difference
		String smallestDifference = DataAnalyser.calculateSmallestDifference(table.getData(), 5, 6);
		
		return smallestDifference;
	}

}
