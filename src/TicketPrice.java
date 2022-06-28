//import java.util.Scanner;
//
//public class TicketPrice {
//    public static void main(String[] args) {
//
//        var keyboard = new Scanner(System.in);
//        int age;
//        double price = 0.00;   // sets the initial value to this.
//        char reply;
//
//        System.out.print("How old are you? ");
//        age = keyboard.nextInt();
//
//        System.out.print("Do you have a coupon? (Y/N ");
//        reply = keyboard.findWithinHorizon(".", 0).charAt(0);
//
//        if (age >= 12  && age < 65) {
//            price = 9.25;
//        }
//        if (age < 12 || age >= 65) {
//            price = 5.25;
//        }
//        if (reply == 'Y' || reply == 'y') {
//            price -= 2.00;
////        }
////        if (!(reply == "Y" || reply == "y" || reply =="N" || reply == "n" )) {
////            System.out.print("Huh? ");
////        }
//
//        System.out.print("PLease pay $");
//        System.out.print(price);
//        System.out.print(" . ");
//        System.out.print("Enjoy the show!");
//
//        keyboard.close();
//    }
//}
