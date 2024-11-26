package fit.evanget.PaceConverter.Converters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitConverterTest {

    @Test
    void kmToMeters() {
        UnitConverter converter = new UnitConverter();
        assertEquals(7500, converter.kmToMeters(7.5));
    }

    @Test
    void metersToKm() {
        UnitConverter converter = new UnitConverter();
        assertEquals(7.5, converter.metersToKm(7500));
    }

    @Test
    void milesToMeters() {
        UnitConverter converter = new UnitConverter();
        assertEquals(4989, converter.milesToMeters(3.1));
    }

    @Test
    void milesToKm() {
        UnitConverter converter = new UnitConverter();
        assertEquals(5, converter.milesToKm(3.1));
    }

    @Test
    void metersToMiles() {
        UnitConverter converter = new UnitConverter();
        assertEquals(3.106855, converter.metersToMiles(5000));
    }

    @Test
    void kmToMiles() {
        UnitConverter converter = new UnitConverter();
        assertEquals(3.106855, converter.kmToMiles(5));
    }
}