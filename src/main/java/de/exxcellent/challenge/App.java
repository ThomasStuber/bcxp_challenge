package de.exxcellent.challenge;

import java.io.IOException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * Main method
     * 
     * Prints day with smallest difference between maximum and minimum temperature
     * and/or team with smallest difference between goals and goals allowed
     * 
     * @param args - pass "--football" or "--weather" if only interested in one of the data (optional)
     * @throws IOException 
     */
    public static void main(String... args) throws IOException {

    	if (args.length != 1 || args.length == 1 && args[0].equals("--weather")) {
    		
    		Data weather = new Data();
    		weather.analyseData("weather.csv", 1, 2);
    		String dayWithSmallestTempSpread = weather.getMinimum();
            System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
    	}
    	if (args.length != 1 || args.length == 1 && args[0].equals("--football")) {
    		
    		Data football = new Data();
    		football.analyseData("football.csv", 5, 6);
    		String teamWithSmallestGoalSpread = football.getMinimum();
            System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    	}
    }
    
}
