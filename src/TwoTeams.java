import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;  //helps in reducing the number of times the whole line is called in a program
import static java.lang.System.out;


public class TwoTeams {
    public static void main(String[] args) {
        var keyboard = new Scanner(in);

//        out.print("Would you like to see a smiley face? If so, Type 'Y' for yes or 'N' for no");
//
//        choice = keyboard.nextLine();

//        int hankees, socks;
//
//        out.print("Hankees and Socks scores? ");
//        hankees = keyboard.nextInt();
//        socks = keyboard.nextInt();
//        out.println();
//
//        if (hankees > socks) {
//            out.print("Hankees: ");
//            out.print(hankees);
//            out.print("Socks: ");
//            out.print(socks);
//        } else {
//            out.print("Socks: ");
//            out.print(socks);
//            out.print("Hankees: ");
//            out.print(hankees);
//        }
        Random myRandom  = new Random();
        out.print(myRandom.nextInt(10) + 1);
        out.print(" ");
        out.print(myRandom.nextInt(10) + 1);
        out.print(" ");
        out.print(myRandom.nextInt(10) + 1);
        keyboard.close();
    }
}
