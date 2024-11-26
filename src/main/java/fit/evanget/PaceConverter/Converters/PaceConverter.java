package fit.evanget.PaceConverter.Converters;

import org.jetbrains.annotations.NotNull;

public class PaceConverter {
    private final UnitConverter unitConverter;
    private final TimeConverter timeConverter;

    public PaceConverter() {
        this.unitConverter = new UnitConverter();
        this.timeConverter = new TimeConverter();
    }

    public double distanceKmPaceOverTime(int @NotNull [] pace, int @NotNull [] time) {
        int paceSeconds = this.timeConverter.timeToSeconds(pace[0], pace[1], pace[2]);
        int timeSeconds = this.timeConverter.timeToSeconds(time[0], time[1], time[2]);
        return this.unitConverter.metersToKm(this.distanceMetersPaceSecondsOverTimeSeconds(paceSeconds, timeSeconds));
    }

    public int[] timePaceOverDistanceKm(int @NotNull [] pace, double distance) {
        int paceSeconds = this.timeConverter.timeToSeconds(pace[0], pace[1], pace[2]);
        int distanceMeters = this.unitConverter.kmToMeters(distance);
        return this.timeConverter.secondsToTime(this.timeSecondsPaceSecondsOverDistanceMeters(paceSeconds, distanceMeters));
    }

    public int distanceMetersPaceSecondsOverTimeSeconds(int secondsPace, int secondsTime) {
        return secondsTime * 1000 / secondsPace;
    }

    public int timeSecondsPaceSecondsOverDistanceMeters(int secondsPace, int metersDistance) {
        return metersDistance * secondsPace / 1000;
    }

    public int[] paceKmToMiles(int @NotNull [] pace) {
        int paceSeconds = this.timeConverter.timeToSeconds(pace[0], pace[1], pace[2]);
        int secondsPerMile = (int) this.unitConverter.milesToKm(paceSeconds);
        return this.timeConverter.secondsToTime(secondsPerMile);
    }

    public int[] paceMilesToKm(int @NotNull [] pace) {
        double paceSeconds = this.timeConverter.timeToSeconds(pace[0], pace[1], pace[2]);
        int secondsPerMile = (int) this.unitConverter.kmToMiles(paceSeconds);
        return this.timeConverter.secondsToTime(secondsPerMile);
    }
}
