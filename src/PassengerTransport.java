/**
 * Created by Михаил on 15.12.2016.
 */
public class PassengerTransport extends Vehicle{

    private int maxAmountOfPeople;
    private String dateOfInspection;

    public PassengerTransport (int maxpass, String lastcheck) {
        maxAmountOfPeople = maxpass;
        dateOfInspection = lastcheck;
    }


}
