import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class AppointmentTest {
    public static void main(String[] args) {
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


        public static void listOfAppointments() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input date of the appointment: ");
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




