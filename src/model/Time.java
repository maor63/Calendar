package model;

public class Time {

    private final Integer hours;
    private final Integer minuts;

    public Time(int hours, int minuts) {
        this.hours = hours;
        this.minuts = minuts;
    }

    //EFFECTS: return represented time as "HH:MM AM/PM"
    public String getTime() {
        String ex;
        String mm = minuts.toString();
        String hh;
        if (hours > 12){
            hh = Integer.valueOf(hours - 12).toString();
            ex = "PM";
        }
        else{
            hh = hours.toString();
            ex = "AM";
        }
        return String.format("%s:%s %s", hh, mm, ex);
    }
}
