/**
 * Created by Михаил on 13.12.2016.
 */
public class Appointment {

    private String description;
    private int day;
    private int month;
    private int year;

    public Appointment(String dsrc, int d, int m, int y) {
        description = dsrc;
        day = d;
        month = m;
        year = y;
    }

    public boolean occursOn(int year, int month, int day) {

    }
}
