import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class Onetime extends Appointment{

    private int Year;
    private int Month;
    private int Day;

    public Onetime() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input date of appointment: ");
        Year = sc.nextInt();
        Month = sc.nextInt();
        Day = sc.nextInt();
    }

    public boolean OccursOn(int y, int m, int d) {
        return (Year == y && Month == m && Day == d);
    }

}
