/**
 * Created by Михаил on 15.12.2016.
 */
public class Boat extends PassengerTransport {

    private String nameOfBoat;
    private int sequence;
    private int lifeJackets;
    private boolean refrigirator;

    public Boat(int maxpass, String n, int seq, int num, boolean ref, String lastcheck) {
        super(maxpass, lastcheck);
        nameOfBoat = n;
        sequence = seq;
        lifeJackets = num;
        refrigirator = ref;
    }


}
