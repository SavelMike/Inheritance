/**
 * Created by Михаил on 12.12.2016.
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee e = new Employee("e", 45000);
        System.out.println(e.toString());
        Manager m = new Manager("m", 55000, "hgtre");
        System.out.println(m.toString());
        Executive ex = new Executive("ex", 48000, "jhte");
        System.out.println(ex.toString());
    }
}
