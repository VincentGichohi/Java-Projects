import java.util.Scanner;
import static java.lang.System.out;
public class Scroreboard {

    enum WhoWins {home, visitor, neither}    // The feature that allows more than two boolean values

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;

        out.print("Hankees and Socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();

        if (hankees > socks) {
            who = WhoWins.home;
            out.println("The Hankees win :-)");
        } else if (socks > hankees) {
            who = WhoWins.visitor;
            out.println("The Socks win :-)");

        } else {
            who = WhoWins.neither;
            out.println("It's a tie :-|");
        }

        out.println();
        out.print("""
                Today's game is brought to you by SnitSoft, the number one software vendor in the Hankeevile area. SnitSoft
                is featured proudly in Chapter 6. And remember, four out of five doctors recommend SnitSoft to their patients.
                """);
        out.println();

        if (who == WhoWins.home) {
            out.println("We beat 'em good. Didn't we? ");
        }
        if (who == WhoWins.visitor) {
            out.println("The empire made an unfair call");
        }
        if (who == WhoWins.neither) {
            out.println("The game goes into extra innings.");
        }

        keyboard.close();
    }
}
