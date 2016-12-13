import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class Monthly extends Appointment {

    private int Day;

    public Monthly() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input day of appointment: ");
        Day = sc.nextInt();
    }

    public boolean occursOn(int y, int m, int d) {
        return Day == d;
    }
}
