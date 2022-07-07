
import java.text.NumberFormat;
import static java.lang.System.out;

public class GoodAccount {
    String lastName;
    int id;
    double balance;

    double getInterest(double rate) {
        double interest;

        out.print("Adding ");
        out.print(rate);
        out.println(" percent ...");

        interest = balance * (rate / 100);
        return interest;
    }

    void display() {
        var currency = NumberFormat.getCurrencyInstance();

        out.print("The account with the last name ");
        out.print(lastName);
        out.print(" and ID number ");
        out.print(" has balance ");
        out.println(currency.format(balance));
    }
}

