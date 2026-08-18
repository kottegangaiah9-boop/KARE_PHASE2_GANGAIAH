......................Calculate area.............................
abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    void area() {
        double r = 5;
        System.out.println("Circle Area: " + 3.14 * r * r);
    }
}

class Rectangle extends Shape {

    void area() {
        int length = 10;
        int breadth = 5;

        System.out.println("Rectangle Area: " + length * breadth);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}
.....................Bank intrest............................
abstract class Bank {

    abstract double getInterestRate();
}

class SBI extends Bank {

    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {

    double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {

    double getInterestRate() {
        return 7.5;
    }
}

public class Main {
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();

        System.out.println("SBI: " + s.getInterestRate());
        System.out.println("HDFC: " + h.getInterestRate());
        System.out.println("ICICI: " + i.getInterestRate());
    }
}
........................Vehicle...........................
abstract class Vehicle {

    abstract void start();

    abstract void stop();
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts");
    }

    void stop() {
        System.out.println("Car stops");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts");
    }

    void stop() {
        System.out.println("Bike stops");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
