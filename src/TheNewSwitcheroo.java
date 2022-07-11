import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class TheNewSwitcheroo {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom =  new Random();
        int randomNumber;
        String output;

        out.print("What's your question my child? ");
        keyboard.nextLine();
        randomNumber = myRandom.nextInt(10) + 1;

        output = switch(randomNumber) {
            case 1 -> "Yes. Isn't it obvious? ";
            case 2 -> "What part of 'mo don't you understand? ";
            case 3 -> "Yessir, yessir! Three bags full.";
            case 4,5 -> "No, and don't ask again.";
            case 6 -> "Sure whatever.";
            case 7 -> "Yes, but only if you're nice to me.";
            case 8 -> """
                    Yes (as if you care).
                    Next time, take your problem and somewhere else.
                    """;
            case 9 -> "No until Cromwell seizes Dover.";
            case 10 -> "No, until Nell squeezes Rover.";
            default -> "My random number generator is broken!";
        };
        out.println(output);

        keyboard.close();
    }

}
