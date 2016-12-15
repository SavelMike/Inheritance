/**
 * Created by Михаил on 15.12.2016.
 */
public class Truck extends CargoTransport {

    private double length;
    private double weidth;
    private double depth;
    private boolean detachable;

    public Truck(double maxCapac, double l, double w, double d, boolean det) {
        super(maxCapac);
        length = l;
        weidth = w;
        depth = d;
        detachable = det;
    }



}
