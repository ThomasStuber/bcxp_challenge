package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    private String successLabel = "not successful";

    @BeforeEach
    void setUp() {
        successLabel = "successful";
    }

    @Test
    void aPointlessTest() {
        assertEquals("successful", successLabel, "My expectations were not met");
    }

    @Test
    void runWeather() throws IOException {
        //App.main("--weather", "weather.csv");
    	App.main();
        assertEquals("14", Weather.analyseData("weather.csv"));
    }
    
    @Test
    void runFootball() throws IOException {
        //App.main("--football", "football.csv");
        App.main();
        assertEquals("Aston_Villa", Football.analyseData("football.csv"));
    }

}