/**
 * Created by Михаил on 15.12.2016.
 */
public class Bus extends PassengerTransport {

    private String nameOfBus;

    public Bus(int maxpass, String n, String lastcheck) {
        super(maxpass, lastcheck);
        nameOfBus = n;
    }



}
