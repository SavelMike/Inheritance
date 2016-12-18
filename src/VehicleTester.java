/**
 * Created by Михаил on 18.12.2016.
 */
public class VehicleTester {
    public static void main(String[] args) {
        VehicleAdministration admin = new VehicleAdministration();
        admin.addTrain(400, 5, 100, "20-01-2015");
        admin.addBoat(2000, "Titanic", 4, 500, true, "20-01-1901");
        admin.addBus(40, "Gazel", "12-06-2000");
        admin.addContainership(2000000, 400);
        admin.addTruck(10000, 6.5, 2.6, 3, false);
        admin.printAllVehicles();
        admin.printAllRidingVehicles();
        admin.printPassengerTransportForMinAmountOfPeople(100);
    }
}
