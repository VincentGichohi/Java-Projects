import java.util.Scanner;

import static java.lang.System.out;

public class ExpressYourFeelings {
    public static void main(String[] args) {
        var keyboard =  new Scanner(System.in);
        String month;
        int numberOfDays = 0;
        boolean isLeapYear;

        out.print("Which month? ");
        month = keyboard.next();

        switch(switch(month) {
            case "January", "March", "May", "July", "August", "October", "December" -> numberOfDays = 31;
            case "April", "June", "September", "November" -> numberOfDays = 30;
            case "February" -> {
                out.print("Leap year (true/false) ? ");
                isLeapYear = keyboard.nextBoolean();
                if (isLeapYear) {
                     yield 29;
                } else {
                    yield 28;
                }
            }
            default -> 0;
        } + "days");
//        out.print("The number of days are: ");
//        out.print(numberOfDays);
//        out.println(" days ");

        keyboard.close();
    }
}
