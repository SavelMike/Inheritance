import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class AppointmentTest {
    public static void main(String[] args) {
        ArrayList<Appointment> app = new ArrayList<Appointment>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Choose options from 1-3:");
            int choice = sc.nextInt();
            if (choice == 1) {
                addAppointment(app);
                continue;
            }
            if (choice == 2) {
                listOfAppointments(app);
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
        for (int i = 0; i < app.size(); i++) {
            if (app.get(i).occursOn(Year, Month, Day)) {
                System.out.println(app.get(i).toString());
            }
        }
    }

    public static void addAppointment(ArrayList<Appointment> app) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input type of your appointment 1-3 (Daily, Monthly, Onetime: ");
        int choice = sc.nextInt();
        Appointment p;
        if (choice == 1) {
            p = new Daily();
        }
        else if (choice == 2) {
            p = new Monthly();
        }
        else if (choice == 3) {
            p = new Onetime();
        } else {
            return;
        }
        app.add(p);
    }
}




