import java.util.Scanner;
import static java.lang.System.out;

public class AddChips {
    public static void main(String[] args) {
       var keyboard = new Scanner(System.in);
       String reply;
       int numberOfChips;

        out.print("""
                How many chips do you have?
                (Type a number, or type 'Not playing')\s
                """);

        //This is where the reply is entered as a string
        reply = keyboard.nextLine();

        //Checks whether the reply equals to the string not playing
        if (!reply.equals("Not playing")) {
            //This reply is then changed into an int using the Integer.parseInt()method
            numberOfChips = Integer.parseInt(reply);
            //the changed int is then added 10 to the total
            numberOfChips += 10;

            out.print("You have ");
            out.print(numberOfChips);
            out.println(" chips: ");
        }
        keyboard.close();

    }

}
