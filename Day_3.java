.....................................pre increment.....................................
public class PreIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
.....................................post increment.....................................
public class PostIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
.....................................pre decrement.....................................
public class PreDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = --a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
.....................................post decrement.....................................
public class PostDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = a--;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
.....................................mixed example.....................................
public class MixedOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = ++a + b++ + --b + a--;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
