import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        Person onePerson = new Person();

        System.out.print("Welcome to the BMI Calculator. Input your weight and height for calculations.");
        System.out.print("Enter your weight: ");
        onePerson.weight = keyboard.nextDouble();
        System.out.print("Enter your height: ");
        onePerson.height = keyboard.nextDouble();

        double total = onePerson.weight / onePerson.height;
        System.out.print("Your BMI is: ");
        System.out.println(Math.round(total));

        keyboard.close();
    }
}
