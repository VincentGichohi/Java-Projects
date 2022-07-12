
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
public class NewDaysOfTheWeek {
    public static void main(String[] args) {
        var keyboard =  new Scanner(System.in);
        var myRandom =  new Random();
        int randomNumber;
        String output;

        out.println("Welcome. The computer assigns the value of the days to a list of strings.");
        randomNumber =  myRandom.nextInt(7) + 1;

        output = switch(randomNumber) {
            case 1 -> "Welcome to the first day of the week, Sunday.";
            case 2 -> "Wow! You've made it to the second day of the week, Monday.";
            case 3 -> "Here comes the third day of the week, Tuesday.";
            case 4 -> "The fourth day of the week is here; Wednesday.";
            case 5 -> "Time to prep for the weekend as it is coming in fast; Thursday.";
            case 6 -> "The last day of the week is here before the weekend begins; Friday";
            case 7 -> "Hurray!! The weekend is officially here.";
            default -> "Well, it appears you came from another planer, there are no other days left.";

        };
        out.println(output);
        keyboard.close();
    }
}
