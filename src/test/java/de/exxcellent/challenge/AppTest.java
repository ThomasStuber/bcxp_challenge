package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class for unit testing
 */

class AppTest {

    @Test
    void analyseDataWeatherTest() throws IOException {
        Data weather = new Data();
        weather.analyseData("weather.csv", 1, 2);
        assertEquals("14", weather.getMinimum());
    }
    
    @Test
    void analyseDataFootballTest() throws IOException {
        Data football = new Data();
        football.analyseData("football.csv", 5, 6);
        assertEquals("Aston_Villa", football.getMinimum());
    }
    
    @Test
    void calculateSmallestDifferenceTest1() {
    	List<String> row1 = Arrays.asList("Day", "MxT", "MnT", "AvT", "AvDP", "MxS", "MxR");
    	List<String> row2 = Arrays.asList("99", "1", "1000", "10", "20", "40", "20");
    	List<String> row3 = Arrays.asList("2", "1002", "2", "22", "33", "30", "30");
    	List<List<String>> rows = new ArrayList<>();
    	rows.add(row1);
    	rows.add(row2);
    	rows.add(row3);
    	DataTable table = new DataTable();
    	table.setData(rows);
    	assertEquals("99", DataAnalyser.calculateSmallestDifference(table, 1, 2));
    }
    
    @Test
    void calculateSmallestDifferenceTest2() {
    	List<String> row1 = Arrays.asList("Day", "MxT", "MnT", "AvT", "AvDP", "MxS", "MxR");
    	List<String> row2 = Arrays.asList("99", "1", "1000", "10", "20", "40", "20");
    	List<String> row3 = Arrays.asList("2", "1002", "2", "22", "33", "30", "30");
    	List<List<String>> rows = new ArrayList<>();
    	rows.add(row1);
    	rows.add(row2);
    	rows.add(row3);
    	DataTable table = new DataTable();
    	table.setData(rows);
    	assertEquals("2", DataAnalyser.calculateSmallestDifference(table, 5, 6));
    }
    
    @Test
    void readFileWeatherTest() throws IOException {
    	DataTable table = new DataTable();
    	table.readFile("weather.csv");
    	assertEquals("Day", table.getData().get(0).get(0));
    	assertEquals("63", table.getData().get(2).get(2));
    }
    
    @Test
    void readFileFootballTest() throws IOException {
    	DataTable table = new DataTable();
    	table.readFile("football.csv");
    	assertEquals("Team", table.getData().get(0).get(0));
    	assertEquals("38", table.getData().get(6).get(6));
    }

}