import java.util.Scanner;
import static java.lang.System.out;

public class WinLoseOrTie {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int hankees, socks;

        out.print("Hankees and Socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();

        if (hankees > socks) {
            out.println("Hankees win ....");
            out.print("Hankees : ");
            out.println(hankees);
            out.print("Socks:  ");
            out.println(socks);
        } else if (socks > hankees) {
            out.println("Socks win ....");
            out.print("Hankees: ");
            out.println(hankees);
            out.print("Socks:  ");
            out.println(socks);
        } else {
            out.println("It's a tie....");
            out.print("Hankees: ");
            out.println(hankees);
            out.print("Socks: ");
            out.println(socks);
        }

        keyboard.close();
    }
}
