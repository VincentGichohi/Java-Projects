
import java.util.Random;
public class ProcessNiceAccounts {
    public static void main(String[] args) {
        var myRandom = new Random();
        NiceAccount  anAccount;
        double InterestRate;

        for (int i=0; i < 3; i++ ) {
            anAccount = new NiceAccount();

            anAccount.lastName = " " +
                    (char) (myRandom.nextInt(26) + 'A') +
                    (char) (myRandom.nextInt(26) + 'A') +
                    (char) (myRandom.nextInt(26) + 'A');

        }
    }
}
