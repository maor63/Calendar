package model;

public class Date {

    private final Integer month;
    private final Integer day;
    private final Integer year;

    private String[] Month = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    //EFFECTS: return the represented date as DD-MM-YYYY

    public String getShortFormatDate() {
        String d = convertToTwoChars(this.day);
        String m = convertToTwoChars(this.month);
        return String.format("%s-%s-%s", d, m, year.toString());
    }
    //EFFECTS: return represented date as "January 1, 2017"

    public String getLongFormatDate() {
        String m = Month[month - 1];
        return String.format("%s %s, %s", m, day.toString(), year.toString());
    }

    private String convertToTwoChars(Integer day) {
        String d = ('0' + day.toString());
        d = d.charAt(d.length() - 2) + "" + d.charAt(d.length() - 1);
        return d;
    }
}
