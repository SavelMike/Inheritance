/**
 * Created by Михаил on 12.12.2016.
 */
public class Employee {

    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String toString() {
        return  "name = " + name + ", salary = " + salary;
    }
}
