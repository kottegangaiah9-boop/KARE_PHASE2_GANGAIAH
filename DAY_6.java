................................................................no of digits in a number................................................................................
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); 

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}

................................................................sum of digits................................................................................
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); 
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
................................................................palindrome................................................................................
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }

        sc.close();
    }
}
................................................................reversing number................................................................................

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}
................................................................Reverse a number using right side formation................................................................................
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;      
            reverse = reverse * 10 + digit; 
            num = num / 10;           
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}
