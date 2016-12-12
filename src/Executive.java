/**
 * Created by Михаил on 12.12.2016.
 */
public class Executive extends Manager {

    public Executive(String n, double s, String dep){
        super(n, s, dep);
    }

    public String toString() {
        return super.toString() + ", class Executive";
    }
}
