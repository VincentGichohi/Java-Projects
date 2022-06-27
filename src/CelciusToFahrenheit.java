import java.util.Scanner;

public class CelciusToFahrenheit {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        double celcius, fahreneit;

        System.out.print("Enter the Celcius temperature: ");
        celcius =  keyboard.nextDouble();

        fahreneit = 9.0 /5.0 * celcius + 32.0;

        System.out.print("Room temperature? ");
        System.out.println(fahreneit == 69.8);
        System.out.print(fahreneit);

        keyboard.close();
    }
}
