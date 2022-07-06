import java.util.Scanner;

public class GDPConverter {
    public static void main(String[] args) {
        var keyboard =  new Scanner(System.in);
        Country oneCountry =  new Country();

        System.out.print("Enter your country's government debt(In trillions): ");
        oneCountry.debt = keyboard.nextDouble();
        System.out.print("Enter your country's gross domestic product(GDP)(In trillions): ");
        oneCountry.gdp = keyboard.nextDouble();

        double debtToGdpRatio = oneCountry.debt / oneCountry.gdp;

        System.out.print("The debt to gdp ratio is: ");
        System.out.println(debtToGdpRatio);

        keyboard.close();
    }
}
