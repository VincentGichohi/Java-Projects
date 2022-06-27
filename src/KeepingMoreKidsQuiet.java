
import java.util.Scanner;
public class KeepingMoreKidsQuiet {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int quaters, dimes, nickels, cents;
        int whatsLeft, total;

        System.out.print("How many cents do you have?");
        total = keyboard.nextInt();

        quaters = total /25;
        whatsLeft = total % 25;

        dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10 ;

        nickels = whatsLeft / 5 ;
        whatsLeft = whatsLeft % 5;

        cents = whatsLeft;

        System.out.println();
        System.out.println(" From " + total + " cents you get.");
        System.out.println(quaters +  "quarters.");
        System.out.println(dimes + "dimes");
        System.out.println(nickels + "nickels");
        System.out.println(cents + "cents");

        keyboard.close();
    }

}
