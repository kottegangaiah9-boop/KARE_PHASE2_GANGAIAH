..................................................convert user input into float......................................................
import java.util.Scanner;

public class IntToFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        float f = num;   // Convert int to floa

        System.out.println("Float value = " + f);

        sc.close();
    }
}
..................................to get float input from user and print it with 2 decimals...............................
import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float num = sc.nextFloat();

        System.out.printf("Float value = %.2f", num);

        sc.close();
    }
}
....................to get a double input from user and print it in program......................................
import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double num = sc.nextDouble();

        System.out.println("Double value = " + num);

        sc.close();
    }
}
..................................addition of two numbers...............................
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
