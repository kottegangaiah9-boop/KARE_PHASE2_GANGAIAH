............................Father  and Son inheritance............................
class Father {
    String house = "2 Houses";
    String car = "BMW";
    int money = 500000;

    void displayFather() {
        System.out.println("House: " + house);
        System.out.println("Car: " + car);
        System.out.println("Money: " + money);
    }
}

class Son extends Father {
    String bike = "Royal Enfield";

    void displaySon() {
        System.out.println("Bike: " + bike);
    }
}

public class Main {
    public static void main(String[] args) {

        Son s = new Son();

        s.displayFather();
        s.displaySon();
    }
}
.................................Person Student.................................
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    Student(String name, int age, int rollNo, int marks) {
        super(name, age);

        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Ravi", 20, 101, 85);

        s.display();
    }
}
...................................Constructor.....................................
class Father {

    String house;
    String car;
    int money;

    Father(String house, String car, int money) {
        this.house = house;
        this.car = car;
        this.money = money;
    }
}

class Son extends Father {

    String bike;

    Son(String house, String car, int money, String bike) {

        super(house, car, money);

        this.bike = bike;
    }

    void display() {
        System.out.println("House: " + house);
        System.out.println("Car: " + car);
        System.out.println("Money: " + money);
        System.out.println("Bike: " + bike);
    }
}

public class Main {
    public static void main(String[] args) {

        Son s = new Son("2 Houses", "Audi", 1000000, "BMW Bike");

        s.display();
    }
}
..................Method overriding....................
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}
