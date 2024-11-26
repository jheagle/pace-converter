package fit.evanget.PaceConverter.Converters;

public class TimeConverter {

    public String timeToString(int @org.jetbrains.annotations.NotNull [] time) {
        if (time.length != 3) {
            throw new NumberFormatException();
        }
        if (time[2] >= 60) {
            // greater than or equal to 60 seconds, we must overflow into minutes
            time[1] += this.secondsToMinutes(time[2]);
            time[2] %= 60;
        }
        if (time[1] >= 60) {
            // greater than or equal to 60 minutes, we must overflow into hours
            time[0] += this.minutesToHours(time[1]);
            time[1] %= 60;
        }
        return String.format("%02d:%02d:%02d", time[0], time[1], time[2]);
    }

    public int timeToSeconds(int hours, int minutes, int seconds) {
        return this.minutesToSeconds(this.hoursToMinutes(hours) + minutes) + seconds;
    }

    public int hoursToMinutes(int hours) {
        return hours * 60;
    }

    public int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    public int[] secondsToTime(int seconds) {
        int minutes = this.secondsToMinutes(seconds);
        return new int[]{
                this.minutesToHours(minutes),
                minutes % 60,
                seconds % 60,
        };
    }

    public int minutesToHours(int minutes) {
        return minutes / 60;
    }

    public int secondsToMinutes(int seconds) {
        return seconds / 60;
    }
}
