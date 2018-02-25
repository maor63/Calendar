package model;

public abstract class Entry {

    private final Date date;
    private final Time time;
    private final String label;
    private int repetitionInterval;
    private Date repetitionDate;

    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
    }

    //Getters

    public Date getDate() {
        return date;
    }
    public Time getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    public int getRepetitionInterval() {
        return repetitionInterval;
    }

    public Date getRepetitionDate() {
        return repetitionDate;
    }

    //Setters
    public void setRepetitionInterval(int repetitionInterval) {
        this.repetitionInterval = repetitionInterval;
    }
}
