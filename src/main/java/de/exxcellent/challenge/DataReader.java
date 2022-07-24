package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReader {
	
	public static List<List<String>> readFile(String file) throws IOException {
		List<List<String>> data = new ArrayList<>();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		
		while ((line = reader.readLine()) != null) {
			String[] values = line.split(",");
			data.add(Arrays.asList(values));
		}
		
		reader.close();
		
		return data;
	}

}
