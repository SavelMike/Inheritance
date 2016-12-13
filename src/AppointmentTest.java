import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class AppointmentTest {
    public static void main(String[] args) {
        ArrayList<Appointment> app = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Choose options from 1-3:");
            int choice = sc.nextInt();
            if (choice == 1) {
                addAppointment();
                System.out.println("not ready");
                continue;
            }
            if (choice == 2) {
                listOfAppointments();
                continue;
            }
            if (choice == 3) {
                System.exit(0);
            }
        }
    }


    public static void listOfAppointments(ArrayList<Appointment> app) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input date of the appointment(y/m/d): ");
        int Year = sc.nextInt();
        int Month = sc.nextInt();
        int Day = sc.nextInt();
        System.out.println("On " + Year + "." + Month + "." + Day + "  you have: ");
        for (int i = 0; i < app.size; i++) {
            if (arrayOfAppointments[i].occursOn(Year, Month, Day)) {
                System.out.println(arrayOfAppointments[i].toString());
            }
        }
    }
}




