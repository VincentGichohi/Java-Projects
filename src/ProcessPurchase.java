import java.util.Scanner;

public class ProcessPurchase {
    public static void main(String[] args) {
        var keyboard =  new Scanner(System.in);
        Purchase onePurchase = new Purchase();

        System.out.print("Unit Price: ");
        onePurchase.unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        onePurchase.quantity = keyboard.nextInt();
        System.out.print("Taxable? (true/false) ");
        onePurchase.taxable = keyboard.nextBoolean();

        double total = onePurchase.unitPrice * onePurchase.quantity;
        if (onePurchase.taxable) {
            total *= 1.05;
        }
        System.out.print("Total: ");
        System.out.println(total);

        keyboard.close();
    }
}
