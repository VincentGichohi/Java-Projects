//import java.util.Scanner;

public class OneMain {
    public static void main(String[] args) {
        var holder1 = new IntegerHolder();
        holder1.value = 79;
        IntegerHolder.howMany++;

        var holder2 = new IntegerHolder();
        holder2.value = 443;
        IntegerHolder.howMany++;

        System.out.println(holder1.value);
        System.out.println(holder2.value);
        System.out.println(IntegerHolder.howMany);

    }
}
