import java.util.Scanner;

public class GDPConverter {
    public static void main(String[] args) {
        var keyboard =  new Scanner(System.in);
        Country oneCountry =  new Country();
        int acceptableGdpRatio = 77;

        var country1 = new Country();
        country1.debt = 20.0;
        country1.gdp = 15;

        var country2 = new Country();
        country2.debt = 25;
        country2.gdp = 20;

        System.out.print("Enter your country's government debt(In trillions): ");
        oneCountry.debt = keyboard.nextDouble();
        System.out.print("Enter your country's gross domestic product(GDP)(In trillions): ");
        oneCountry.gdp = keyboard.nextDouble();

        double debtToGdpRatio = (oneCountry.debt / oneCountry.gdp) * 100;
        double debtToGdpRatio1 = (country1.debt / country1.gdp) * 100;
        double debtToGdpRatio2 = (country2.debt / country2.gdp) * 100;

        System.out.print("The debt to gdp ratio is: ");
        System.out.println(debtToGdpRatio);

        System.out.print("Enter the acceptable debt-to-gdp ratio for your country: ");
        oneCountry.gdpInput = keyboard.nextDouble();

        System.out.println(debtToGdpRatio1);
        System.out.println(debtToGdpRatio2);

        if (oneCountry.gdpInput >= acceptableGdpRatio) {
            System.out.println("That's acceptable");
        } else {
            System.out.println("That's not acceptable");
        }

        keyboard.close();
    }
}
