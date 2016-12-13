import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class Appointment {

    private String description;
    private int day;
    private int month;
    private int year;

    public Appointment(int y, int m, int d) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input description: ");
        String dsrc = sc.next();
    }

    public boolean occursOn(int year, int month, int day) {
        return true;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return description;
    }


}
