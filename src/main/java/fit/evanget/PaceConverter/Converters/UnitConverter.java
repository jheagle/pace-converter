package fit.evanget.PaceConverter.Converters;

public class UnitConverter {
    public int kmToMeters(double km) {
        return (int) (km * 1000.0);
    }

    public double metersToKm(int meters) {
        return meters / 1000.0;
    }

    public double milesToMeters(double miles) {
        return Math.ceil(miles * 1609.344);
    }

    public double milesToKm(double miles) {
        return Math.ceil(miles * 1.60934);
    }

    public double metersToMiles(double meters) {
        return meters * 0.000621371;
    }

    public double kmToMiles(double meters) {
        return meters * 0.621371;
    }
}
