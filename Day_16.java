.................................Create and display linked list..............................................
import java.util.Scanner;

class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
.........................................Single linked list.........................................
import java.util.Scanner;

public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }
}
...............................Double linked list.................................
import java.util.Scanner;

public class Main {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {

                head = newNode;
                tail = newNode;

            } else {

                tail.next = newNode;
                newNode.prev = tail;

                tail = newNode;
            }
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sc.close();
    }
}
...........................Circular sinle linked list.......................
import java.util.Scanner;

class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {

                head = newNode;
                tail = newNode;

                tail.next = head;

            } else {

                tail.next = newNode;
                tail = newNode;

                tail.next = head;
            }
        }
        if (head != null) {

            Node current = head;

            do {
                System.out.print(current.data + " ");
                current = current.next;

            } while (current != head);
        }

        sc.close();
    }
}
..........................Circular double linked list..................................
import java.util.Scanner;

class Main {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

    
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {

                head = newNode;
                tail = newNode;

                head.next = head;
                head.prev = head;

            } else {

                tail.next = newNode;
                newNode.prev = tail;

                newNode.next = head;
                head.prev = newNode;

                tail = newNode;
            }
        }

        if (head != null) {

            Node current = head;

            do {
                System.out.print(current.data + " ");
                current = current.next;

            } while (current != head);
        }

        System.out.println();

        if (tail != null) {

            Node current = tail;

            do {
                System.out.print(current.data + " ");
                current = current.prev;

            } while (current != tail);
        }

        sc.close();
    }
}
