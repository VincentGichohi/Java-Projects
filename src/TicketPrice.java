import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        int age;

        double price = 0.00;   // sets the initial value to this.

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        if (age >= 12  && age < 65) {
            price = 9.25;
        }
        if (age < 12 || age >= 65) {
            price = 5.25;
        }

        System.out.print("PLease pay $");
        System.out.print(price);
        System.out.print(" . ");
        System.out.print("Enjoy the show!");

        keyboard.close();
    }
}
