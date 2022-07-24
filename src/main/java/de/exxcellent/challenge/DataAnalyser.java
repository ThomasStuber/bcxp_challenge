package de.exxcellent.challenge;

import java.util.List;

public class DataAnalyser {
	

	public static String calculateSmallestDifference(List<List<String>> data) {
		
		int minimumDifference = Integer.MAX_VALUE;
		String minimumDay = "";
		
		int i = 0;
		
		for (List<String> list : data) {
			if (i > 0) {
				int difference = Math.abs(Integer.parseInt(list.get(1)) - Integer.parseInt(list.get(2)));
				if (difference < minimumDifference) {
					minimumDifference = difference;
					minimumDay = list.get(0);
				}
			}
			i++;
		}
		return minimumDay;
	}
}
