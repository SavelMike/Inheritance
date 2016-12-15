import java.util.Scanner;

/**
 * Created by Михаил on 13.12.2016.
 */
public class Appointment {

    private String description;

    public Appointment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input description: ");
        description = sc.nextLine();
    }

    public boolean occursOn(int y, int m, int d) {
        return true;
    }

    public String toString() {
        return description;
    }


}
