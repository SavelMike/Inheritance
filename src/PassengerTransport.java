/**
 * Created by Михаил on 15.12.2016.
 */
public class PassengerTransport extends Vehicle{

    private int maxAmountOfPeople;
    private String dateOfInspection;

    public PassengerTransport (int maxpass, String lastcheck, boolean ridingVehicle) {
        super(ridingVehicle);
        maxAmountOfPeople = maxpass;
        dateOfInspection = lastcheck;
    }

    public String toString() {
        return "max passengers: " + maxAmountOfPeople + "; last inspection: " + dateOfInspection;
    }


}
