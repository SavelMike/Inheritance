/**
 * Created by Михаил on 15.12.2016.
 */
public class Train extends PassengerTransport {

    private int numOfCars;
    private double totalLength;

    public Train(int maxpass, int numcars, int lenght, String lastcheck) {
        super(maxpass, lastcheck, true);
        numOfCars = numcars;
        totalLength = lenght;

    }

    public String toString() {
        return super.toString() + "; Number of cars: " + numOfCars + "; Total length: " + totalLength;
    }


}
