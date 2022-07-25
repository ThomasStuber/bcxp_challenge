package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class to read file and store data as table
 */

public class DataTable {
	
	private List<List<String>> table = new ArrayList<>();
	
	public List<List<String>> getData() {
		return this.table;
	}
	
	public void setData(List<List<String>> rows) {
		this.table = rows;
	}
	
	/**
	 * Reads file and stores it in data
	 * 
	 * @param file - file to be read
	 * @throws IOException
	 */
	public void readFile(String file) throws IOException {
		
		// retrieve file from resources folder
		InputStream is = this.getClass().getResourceAsStream(file);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line;
		
		// read file and store as table
		while ((line = reader.readLine()) != null) {
			String[] values = line.split(",");
			this.table.add(Arrays.asList(values));
		}
		reader.close();
	}
	
}