import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class Onetime extends Appointment{

    public Onetime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input date of appointment: ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        super(y, m, d);
    }

    public boolean OccursOn(int y, int m, int d) {
        return (super.getYear() == y && super.getMonth() == m && super.getDay() == d);
    }

}
