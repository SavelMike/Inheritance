/**
 * Created by Михаил on 15.12.2016.
 */
public class Containership extends CargoTransport {

    private int numOfContainers;

    public Containership(double maxCapac, int numCont) {
        super(maxCapac, false);
        numOfContainers = numCont;
    }

    public String toString() {
        return super.toString() + "; Number of containers: " + numOfContainers;
    }
}
