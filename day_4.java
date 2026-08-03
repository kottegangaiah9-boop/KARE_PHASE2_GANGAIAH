................................print 1 to 10 numbers................................
print numbers from 1 to 10
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
................................factors of a number................................
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}


................................Multiplication table................................
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
................................print even numbers................................
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
................................print odd numbers................................
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
