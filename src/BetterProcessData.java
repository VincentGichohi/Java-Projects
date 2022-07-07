import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class BetterProcessData {
    public static void main(String[] args) {
       var keyboard = new Scanner(System.in);
       keyboard.useLocale(Locale.FRANCE);
       double unitPrice;
       int quantity;
       boolean taxable;

//       NumberFormat currency = NumberFormat.getCurrencyInstance();
        var currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.print("Unit Price: ");
        unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        quantity = keyboard.nextInt();
        System.out.print("taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        double total = unitPrice * quantity;
        if (taxable) {
            total = total * 1.05;
        }

        String niceTotal = currency.format(total);
        System.out.print("Total:  ");
        System.out.println(niceTotal);

        keyboard.close();
    }
}
