package fit.evanget.PaceConverter.Converters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaceConverterTest {

    @Test
    void distanceKmPaceOverTime() {
        PaceConverter converter = new PaceConverter();
        assertEquals(7.5, converter.distanceKmPaceOverTime(new int[]{0, 5, 0}, new int[]{0, 37, 30}));
    }

    @Test
    void timePaceOverDistanceKm() {
        PaceConverter converter = new PaceConverter();
        assertArrayEquals(new int[]{0, 37, 30}, converter.timePaceOverDistanceKm(new int[]{0, 5, 0}, 7.5));
    }

    @Test
    void distanceMetersPaceSecondsOverTimeSeconds() {
        PaceConverter converter = new PaceConverter();
        assertEquals(5000, converter.distanceMetersPaceSecondsOverTimeSeconds(300, 1500));
        assertEquals(7500, converter.distanceMetersPaceSecondsOverTimeSeconds(300, 2250));
    }

    @Test
    void paceKmToMiles() {
        PaceConverter converter = new PaceConverter();
        assertArrayEquals(new int[]{0, 8, 3}, converter.paceKmToMiles(new int[]{0, 5, 0}));
    }

    @Test
    void paceMilesToKm() {
        PaceConverter converter = new PaceConverter();
        assertArrayEquals(new int[]{0, 4, 58}, converter.paceMilesToKm(new int[]{0, 8, 0}));
    }
}