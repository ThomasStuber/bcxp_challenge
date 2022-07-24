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
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     * @throws IOException 
     */
    public static void main(String... args) throws IOException {

    	if (args.length != 1 || args.length == 1 && args[0].equals("--weather")) {
    		
    		String dayWithSmallestTempSpread = Weather.analyseData("weather.csv");
            System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
    	}
    	if (args.length != 1 || args.length == 1 && args[0].equals("--football")) {
    		
    		String teamWithSmallestGoalSpread = Football.analyseData("football.csv");
            System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    	}
    }
    
}
