import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;


public class DaysOfTheWeek {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int randomNumber;

        randomNumber = myRandom.nextInt(7) + 1;
        switch (randomNumber) {
            case 1 -> out.println("Welcome to the begining of the week. It is Sunday!!");
            case 2 -> out.println("Welcome to the second day of the week, Monday.");
            case 3 -> out.println("Welcome to the third day of the week, Tuesday.");
            case 4 -> out.println("Welcome to the fourth day of the week, Wednesday.");
            case 5 -> out.println("Welcome to the fifth day of the week, Thursday.");
            case 6 -> out.println("Welcome to the sixth day of the week, Friday.");
            case 7 -> out.println("Welcome to the last day of the week, Saturday.");
            default -> out.println("Well, the week is done. See you next week!");

        }

        keyboard.close();

    }
}
