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
        randomNumber = myRandom.nextInt(10) + 1;

        switch (randomNumber) {
            case 1 -> out.println("Yes. Isn't it obvious? ");
            case 2 -> out.println("What part of no! don't you understand?");

        }

    }
}
