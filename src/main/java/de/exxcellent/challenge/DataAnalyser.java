package de.exxcellent.challenge;

import java.util.List;

/**
 * Class for data analysis
 */

public class DataAnalyser {
	
	/**
	 * Calculates smallest absolute difference between two table columns and returns value of first cell of that row
	 * 
	 * @param table - the data table to be analysed
	 * @param column1 - first column of interest
	 * @param column2 - second column of interest
	 * @return first cell of row with smallest absolute difference between column1 and column2
	 */
	public static String calculateSmallestDifference(DataTable table, int column1, int column2) {
		
		int minimumDifference = Integer.MAX_VALUE;
		String minimumItem = "";
		int i = 0;
		
		// iterate over data table and calculate item with smallest absolute difference between the columns
		for (List<String> list : table.getData()) {
			if (i > 0) {
				int difference = Math.abs(Integer.parseInt(list.get(column1)) - Integer.parseInt(list.get(column2)));
				if (difference < minimumDifference) {
					minimumDifference = difference;
					minimumItem = list.get(0);
				}
			}
			i++;
		}
		return minimumItem;
	}
	
}
