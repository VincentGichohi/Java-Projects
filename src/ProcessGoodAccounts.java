
import java.util.Random;
import java.text.NumberFormat;

public class ProcessGoodAccounts {

    public static void main(String[] args) {
        var myRandom =  new Random();
        var currency = NumberFormat.getCurrencyInstance();
        GoodAccount anAccount;
        double interestRate;
        double yearlyInterest;

        for (i=0; i < 3; i++) {
            anAccount = new GoodAccount();

            anAccount.lastName = "" +
                    (char) (myRandom.nextInt(26) + 'A') +
                    (char) (myRandom.nextInt(26) + 'A') +
                    (char) (myRandom.nextInt(26) + 'A');
            anAccount.id = myRandom.nextInt(10000);

        }
    }
}
