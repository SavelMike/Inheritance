/**
 * Created by Михаил on 13.12.2016.
 */
public class Daily extends Appointment {

    public Daily(String dscr) {
        super(dscr, 0, 0, 0);
    }

    public boolean occursOn(int y, int m, int d) {
        return true;
    }
}
