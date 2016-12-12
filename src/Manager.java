/**
 * Created by Михаил on 12.12.2016.
 */
public class Manager extends Employee {

    private String department;

    public Manager(String n, double s, String dep) {
        super(n, s);
        department = dep;
    }

    public String toString() {
        return super.toString() + ", depertment = " + department;
    }
}
