........................all zeros shift left.........................
public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 0, 5, 6, 0};

        int index = arr.length - 1;

      
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }

        
        while (index >= 0) {
            arr[index] = 0;
            index--;
        }

      
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
.........................Zeros to  right..........................
public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 0, 5, 6, 0};

        int index = 0;

       
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

       
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
}
