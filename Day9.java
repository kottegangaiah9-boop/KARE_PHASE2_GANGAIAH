...........................single inheritance...........................
class Father {
    void house() {
        System.out.println("Father has a house");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son has a bike");
    }
}

public class Main {
    public static void main(String[] args) {

        Son s = new Son();

        s.house();
        s.bike();
    }
}
...........................Multi level  inheritance...........................
class Grandfather {
    void land() {
        System.out.println("Grandfather has land");
    }
}

class Father extends Grandfather {
    void house() {
        System.out.println("Father has a house");
    }
}

class Son extends Father {
    void car() {
        System.out.println("Son has a car");
    }
}

public class Main {
    public static void main(String[] args) {

        Son s = new Son();

        s.land();
        s.house();
        s.car();
    }
}
...........................Hierarchical inheritance...........................
class Father {
    void property() {
        System.out.println("Father has property");
    }
}

class Son1 extends Father {
    void bike() {
        System.out.println("Son1 has a bike");
    }
}

class Son2 extends Father {
    void car() {
        System.out.println("Son2 has a car");
    }
}

public class Main {
    public static void main(String[] args) {

        Son1 s1 = new Son1();

        s1.property();
        s1.bike();

        Son2 s2 = new Son2();

        s2.property();
        s2.car();
    }
}
...........................Hybrid inheritance...........................
interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

interface Wild {
    void hunt();
}

class Dog implements Pet, Wild {

    public void eat() {
        System.out.println("Dog eats");
    }

    public void play() {
        System.out.println("Dog plays");
    }

    public void hunt() {
        System.out.println("Dog hunts");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.play();
        d.hunt();
    }
}
