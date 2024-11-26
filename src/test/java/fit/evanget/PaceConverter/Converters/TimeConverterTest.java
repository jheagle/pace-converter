package fit.evanget.PaceConverter.Converters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {

    @Test
    void timeToString() {
        TimeConverter converter = new TimeConverter();
        assertEquals("02:38:46", converter.timeToString(new int[]{2, 38, 46}));
        assertEquals("102:45:00", converter.timeToString(new int[]{99, 220, 300}));
        assertEquals("60:00:00", converter.timeToString(new int[]{59, 59, 60}));
        assertThrows(NumberFormatException.class, () -> converter.timeToString(new int[]{}));
    }

    @Test
    void timeToSeconds() {
        TimeConverter converter = new TimeConverter();
        assertEquals(9526, converter.timeToSeconds(2, 38, 46));
    }

    @Test
    void hoursToMinutes() {
        TimeConverter converter = new TimeConverter();
        assertEquals(120, converter.hoursToMinutes(2));
    }

    @Test
    void minutesToSeconds() {
        TimeConverter converter = new TimeConverter();
        assertEquals(120, converter.minutesToSeconds(2));
    }

    @Test
    void secondsToTime() {
        TimeConverter converter = new TimeConverter();
        assertArrayEquals(new int[]{2, 38, 46}, converter.secondsToTime(9526));
    }

    @Test
    void minutesToHours() {
        TimeConverter converter = new TimeConverter();
        assertEquals(2, converter.minutesToHours(158));
    }

    @Test
    void secondsToMinutes() {
        TimeConverter converter = new TimeConverter();
        assertEquals(158, converter.secondsToMinutes(9526));
    }
}