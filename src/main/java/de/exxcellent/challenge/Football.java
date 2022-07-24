package de.exxcellent.challenge;

import java.io.IOException;

public class Football {
	
	public static String analyseData(String file) throws IOException {
		
		/** read file and return table */
		DataTable table = new DataTable();
		table.readFile(file);
		
		/** calculate the team with the smallest difference between goals and goals allowed */
		String smallestDifference = DataAnalyser.calculateSmallestDifference(table, 5, 6);
		
		return smallestDifference;
	}

}
