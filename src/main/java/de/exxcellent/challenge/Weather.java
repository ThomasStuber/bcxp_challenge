package de.exxcellent.challenge;

import java.io.IOException;

public class Weather {

	public static String analyseData(String file) throws IOException {
		
		// read file
		DataTable table = new DataTable();
		table.readFile(file);
		//List<List<String>> data = DataTable.readFile(file);
		// calculate smallest difference
		String smallestDifference = DataAnalyser.calculateSmallestDifference(table.getData());
		
		return smallestDifference;
	}
	
}
