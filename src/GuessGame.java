import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class GuessGame {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int guess, compGuess;

        out.print("Welcome to the guess game. Guess any number\n");
        guess = keyboard.nextInt();
        compGuess = myRandom.nextInt(10) + 1;

        if (guess == compGuess) {
            out.print("You win!!");
            out.print("The computer guessed: ");
            out.println(" ");
            out.println(guess);
        } else {
            out.print("You lose. The computer wins!");
            out.print("The computer guessed? ");
            out.println(" ");
            out.println(compGuess);

            keyboard.close();
        }
    }
}
