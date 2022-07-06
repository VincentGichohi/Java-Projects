import java.util.Scanner;

public class ProcessPurchaseRecord {
    public static void main(String[] args) {
       var keyboard =  new Scanner(System.in);

        System.out.print("Unit Price: ");
        var unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        var quantity = keyboard.nextInt();
        System.out.print("Taxable? (true/false) ");
        var taxable = keyboard.nextBoolean();

        var onePurchase  = new PurchaseRecord(unitPrice, quantity, taxable);

        double total = onePurchase.unitPrice() * onePurchase.quantity();
        if (onePurchase.taxable()) {
            total = total * 1.05;
        }

        System.out.print("Total: ");
        System.out.println(total);

        keyboard.close();
    }
}
