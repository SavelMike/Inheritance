/**
 * Created by Михаил on 15.12.2016.
 */
public class Bus extends PassengerTransport {

    private String nameOfBus;

    public Bus(int maxpass, String n, String lastcheck, boolean ridingVehicle) {
        super(maxpass, lastcheck, ridingVehicle);
        nameOfBus = n;
    }

    public String toString() {
        return super.toString() + "; Name of the bus: " + nameOfBus;
    }



}
