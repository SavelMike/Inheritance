import java.util.ArrayList;

/**
 * Created by Михаил on 15.12.2016.
 */
public class VehicleAdministration {

    private ArrayList<Vehicle> allVehicles;

    public VehicleAdministration () {
        allVehicles = new ArrayList<Vehicle>();
    }

    public void addTrain(int maxpass, int numcars, int lenght, String lastcheck) {
        Train t = new Train(maxpass, numcars, lenght, lastcheck);
        allVehicles.add(t);
    }

    public void addBus(int maxpass, String n, String lastcheck) {
        Bus b = new Bus(maxpass, n, lastcheck);
        allVehicles.add(b);
    }

    public void addBoat(int maxpass, String n, int seq, int numOfJackets, boolean ref, String lastcheck) {
        Boat bt = new Boat(maxpass, n, seq, numOfJackets, ref, lastcheck);
        allVehicles.add(bt);
    }

    public void addTruck(double maxCapac, double l, double w, double d, boolean det) {
        Truck t = new Truck(maxCapac, l, w, d, det);
        allVehicles.add(t);
    }

    public void addContainership(double maxCapac, int numCont) {
        Containership c = new Containership(maxCapac, numCont);
        allVehicles.add(c);
    }

    public ArrayList printAllVehicles() {
        
    }

    public ArrayList printAllRidingVehicles() {

    }

    public ArrayList printPassengerTransportForMinAmountOfPeople() {

    }
}
