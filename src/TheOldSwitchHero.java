import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class TheOldSwitchHero {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int randomNumber;

        out.print("Type your question my child: ");
        keyboard.nextLine();
        //This is the selector that will be inputted in the switch statement
        randomNumber = myRandom.nextInt(10) + 1;

        //The switch statement replaces if statements being repeated over and over.
        //The random generator generates a list of random  numbers from 1 to 10
        //All these numbers are replaced by the corresponding statements.
        //This statements will be printed in place of the numbers generated.
        switch (randomNumber) {
            case 1 -> out.println("Yes. Isn't it obvious? ");
            case 2 -> out.println("What part of no! don't you understand?");
            case 3 -> out.println("Yes, yessssir!! Three bags full!");
            case 4,5 -> out.println("No, and don't ever ask again");
            case 6 -> out.println("Sure, whatever.");
            case 7 -> out.println("Yes, but only if you're nice to me.");
            case 8 -> {
                out.print("Yes (as if I care).");
                out.println(" Next time, take your problems somewhere else.");
            }
            case 9 -> out.println("No, not until Conwell seizes Dover.");
            case 10 -> out.println("No, not until Nell squeezes Rover.");
            //This line is entirely optional. You can choose to include it or not.
            default -> out.println("My random number generator is broken! ");
        }

        out.println("GoodBye!!");

        keyboard.close();
    }
}
