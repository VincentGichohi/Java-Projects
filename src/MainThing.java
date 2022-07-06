import java.util.Scanner;

public class MainThing {
    public static void main(String[] args) {
        var keyboard =  new Scanner(System.in);
        Thing oneThing =  new Thing();

        System.out.print("Enter the first number : ");
        oneThing.value1 = keyboard.nextInt();

        System.out.print("Enter the second number: ");
        oneThing.value2 = keyboard.nextInt();

        String str = String.format("The value of numbers entered are: %.2f, %.2f", oneThing.value1, oneThing.value2);
        System.out.println(str);

        keyboard.close();
    }
}
