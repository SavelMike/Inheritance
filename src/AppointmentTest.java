import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class AppointmentTest {
    public static void main(String[] args) {
        Appointment[] arrayOfAppointments
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
            if (arrayOfAppointments[i].occursOn(Year, Month, Day)) {
                System.out.println(arrayOfAppointments[i].toString());
            }
        }
    }





    while(true)

    {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Choose options from 1-3:");
        if (choice == 1) {
            addAppointment();
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


    public static void listOfAppointments() {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        int Month = sc.nextInt();
        int Day = sc.nextInt();
        System.out.println("On " + Year + "." + Month + "." + Day + "  you have: ");
        for (int i = 0; i < arrayOfAppointments.length; i++) {
            if (arrayOfAppointments[i].occursOn(Year, Month, Day)) {
                System.out.println(arrayOfAppointments[i].toString());
            }
        }
    }

}




