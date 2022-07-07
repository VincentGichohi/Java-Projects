import javax.swing.*;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        var currency = NumberFormat.getCurrencyInstance();
        String inputString = JOptionPane.showInputDialog("Enter an amount");
        double inputAmount = Double.parseDouble(inputString);
        double oneMore = inputAmount + 1;
        String oneMoreMoney = currency.format(oneMore);
        String message = "One more than that amount is " + oneMoreMoney + ".";
        JOptionPane.showMessageDialog(null, message);
    }
}
