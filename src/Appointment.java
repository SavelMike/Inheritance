/**
 * Created by Михаил on 13.12.2016.
 */
public class Appointment {

    private String description;
    private int day;
    private int month;
    private int year;

    public Appointment(String dsrc, int y, int m, int d) {
        description = dsrc;
        day = d;
        month = m;
        year = y;
    }

    public boolean occursOn(int year, int month, int day) {
        return true;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return description;
    }

    public void add
}
