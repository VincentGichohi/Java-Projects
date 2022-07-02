
import java.util.Scanner;
public class CanIKeepKidsQuiet {

    public static void main(String[] args) {
//        int gumballs;
//        int kids;
//        int gumballsPerKid;
//        boolean eachKidGetsTen;
//
//        gumballs = 140;
//        kids = 15;
//        gumballsPerKid = gumballs / kids;
//
//        System.out.print("True or False? ");
//        System.out.println("Each kid gets 10 gumballs. ");
//        eachKidGetsTen = gumballsPerKid >= 10;
//        System.out.println(eachKidGetsTen);

        var keyboard = new Scanner(System.in);
        char symbol;

        symbol = keyboard.findWithinHorizon(".",0).charAt(0);

        while (symbol != '@') {
            System.out.print(symbol);
            symbol = keyboard.findWithinHorizon(".",0).charAt(0);
        }
        System.out.println();

        keyboard.close();
    }
}
