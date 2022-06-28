import java.util.Scanner;
import static java.lang.System.out;
public class Scoreboard {

    enum WhoWins {home, visitor, neither}    // The feature that allows more than two boolean values(true and false)

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;    //The WhoWins is then given a variable name which is empty by default and then values are assigned
                        // to it in the if statements.

        out.print("Hankees and Socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();

        if (hankees > socks) {
            who = WhoWins.home;  // The variable who name is now given a value; the result of the first statement
            out.println("The Hankees win :-)");
        } else if (socks > hankees) {
            who = WhoWins.visitor; // the visitor value is taken from  the WhoWins enum character
            out.println("The Socks win :-)");

        } else {
            who = WhoWins.neither;  // the neither value is taken from  the WhoWins enum character
            out.println("It's a tie :-|");
        }

        out.println();
        out.print("""
                Today's game is brought to you by SnitSoft, the number one software vendor in the Hankeevile area. SnitSoft
                is featured proudly in Chapter 6. And remember, four out of five doctors recommend SnitSoft to their patients.
                """);
        out.println();

        if (who == WhoWins.home) {  //comparing the who value to the values in the enum character WhoWins
            out.println("We beat 'em good. Didn't we? ");
        }
        if (who == WhoWins.visitor) {   //comparing the who value to the values in the enum character WhoWins
            out.println("The empire made an unfair call");
        }
        if (who == WhoWins.neither) {    //comparing the who value to the values in the enum character WhoWins
            out.println("The game goes into extra innings.");
        }

        keyboard.close();
    }
}
