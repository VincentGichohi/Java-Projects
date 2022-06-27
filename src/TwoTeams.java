import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;


public class TwoTeams {
    public static void main(String[] args) {
        var keyboard = new Scanner(in);
        int hankees, socks;

        out.print("Hankees and Socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();

        if (hankees > socks) {
            out.print("Hankees: ");
            out.print(hankees);
            out.print("Socks: ");
            out.print(socks);
        } else {
            out.print("Socks: ");
            out.print(socks);
            out.print("Hankees: ");
            out.print(hankees);
        }
        keyboard.close();
    }
}
