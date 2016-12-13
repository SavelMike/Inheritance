/**
 * Created by Михаил on 13.12.2016.
 */
public class Onetime extends Appointment{

    public Onetime(String dsrc, int y, int m, int d) {
        super(dsrc, y, m, d);
    }

    public boolean OccursOn(int y, int m, int d) {
        return (super.getYear() == y && super.getMonth() == m && super.getDay() == d);
    }

}
