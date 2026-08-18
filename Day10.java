.........................Default Constructor.........................
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
    }
}
.........................Parametarized constructor.........................
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Ravi", 20);

        s.display();
    }
}
..........................Constuctor overloading.........................
class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name) {
        this.name = name;
        age = 18;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Ravi");
        Student s3 = new Student("Kumar", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}
