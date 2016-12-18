/**
 * Created by Михаил on 15.12.2016.
 */
public class CargoTransport extends Vehicle {

    private double maxLoadCapacity;

    public CargoTransport(double maxCapac, boolean ridingVehicle) {
        super(ridingVehicle);
        maxLoadCapacity = maxCapac;
    }

    public String toString() {
        return "Maximum capacity: " + maxLoadCapacity;
    }
}
