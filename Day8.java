...........................Linear search..............................
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
..........................Binary search...............................
public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int key = 50;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if (key > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
