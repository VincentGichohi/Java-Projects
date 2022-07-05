import java.io.File;
import java.util.Scanner;
public class IHopeYouKnowWhatYouAreDoing {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        char reply;
        int guess;

        do {
            System.out.print("Reply with Y or N.....");
            System.out.print(" Delete the important Data File? ");
            reply = keyboard.findWithinHorizon(". ", 0).charAt(0);
        } while (reply != 'Y' && reply != 'N');

            if (reply == 'Y') {
                new File ("importantData.txt").delete();
                System.out.println("Deleted!");
            } else {
                System.out.println("No harm in asking!");
//            }
//        do {
//            System.out.print("Guess a number: ");
//            guess = keyboard.nextInt();
//        } while (guess )
        keyboard.close();

    }
}

