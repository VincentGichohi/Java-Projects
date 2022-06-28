import java.util.Scanner;

public class NicePrice {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int age;
        double price = 0.00;
        char reply;
        boolean isKid, isSenior, hasCoupon, hasNoCoupon;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();    //stores the age inputted above

        System.out.print("Have a coupon? (y/N) ");
        reply = keyboard.findWithinHorizon(".", 0).charAt(0);

        isKid = age < 12;
        isSenior = age >= 65;
        hasCoupon = reply == 'Y' || reply == 'y';
        hasNoCoupon = reply == 'N' || reply == 'n';

//        if (!isKid && !isSenior) {
//            price = 9.25;
//        }
//        if (isKid || isSenior) {
//            price = 5.25;
//        }
//        if (hasCoupon) {
//            price -=2.00;
//        }
//        if (!hasCoupon && !hasNoCoupon) {
//            System.out.println("Huh?? ");
//        }
//        if (age >= 12 && age < 65) {
//            price = 9.25;
//        }
//        if (age < 12 || age >= 65) {
//            price = 5.25;
//        }
//        if ((reply == 'Y' || reply == 'y') && (age >= 12 && age < 65)) {
//            price -=2.00;
//        }

        if (age >= 12 && age < 65) {
            price = 9.25;
            if (reply == 'Y' || reply == 'y') {
                price -=2.00;
            }
        } else {
            price = 5.25;
        }

        System.out.print("Please pay $");
        System.out.print(price);
        System.out.print(" . ");
        System.out.print("Enjoy the show!");

        keyboard.close();
    }
}
