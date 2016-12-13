import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class AppointmentTest {
    public static void main(String[] args) {
        Appointment[] arrayOfAppointments = new Appointment[3];
        Onetime o = new Onetime("meet with banker", 2016, 8, 14);
        Daily d = new Daily("meet with seller");
        Monthly m = new Monthly("meet with teacher", 15);
        arrayOfAppointments[0] = o;
        arrayOfAppointments[1] = d;
        arrayOfAppointments[2] = m;
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        int Month = sc.nextInt();
        int Day = sc.nextInt();
        System.out.println("On " + Year + "." + Month + "." + Day + "  you have: ");
        for (int i = 0; i < arrayOfAppointments.length; i++) {
            if (arrayOfAppointments[i].occursOn(2018, 6, 9)) {
                System.out.println(arrayOfAppointments[i].toString());
            }
        }
    }
}