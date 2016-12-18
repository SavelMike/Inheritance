/**
 * Created by Михаил on 15.12.2016.
 */
public class Boat extends PassengerTransport {

    private String nameOfBoat;
    private int sequence;
    private int lifeJackets;
    private boolean refrigerator;

    public Boat(int maxpass, String n, int seq, int numOfJackets, boolean ref, String lastcheck) {
        super(maxpass, lastcheck);
        nameOfBoat = n;
        sequence = seq;
        lifeJackets = numOfJackets;
        refrigerator = ref;
    }

    public String toString() {
        return "Name of a boat: " + nameOfBoat + " ; Sequence: " + sequence + "; Number of life jackets: " + lifeJackets +
                "; Refrigerator: " + refrigerator;
    }


}
