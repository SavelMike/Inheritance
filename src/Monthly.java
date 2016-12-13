/**
 * Created by Михаил on 13.12.2016.
 */
public class Monthly extends Appointment{

    public Monthly(String dscr, int d) {
        super(dscr, 0, 0, d);
    }

    public boolean occursOn(int y, int m, int d) {
        return super.getDay() == d;
    }
}
