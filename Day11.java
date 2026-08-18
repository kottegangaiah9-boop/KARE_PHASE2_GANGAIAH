...........................ATM pin.................................
class Account {

    private int pin;

    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            System.out.println("PIN must contain 4 digits");
        }
    }

    public boolean checkPin(int enteredPin) {
        return pin == enteredPin;
    }
}

public class Main {
    public static void main(String[] args) {

        Account a = new Account();

        a.setPin(1234);

        if (a.checkPin(1234)) {
            System.out.println("Correct PIN");
        } else {
            System.out.println("Wrong PIN");
        }
    }
}
...............................Bank Account....................................
class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b = new BankAccount(12345, 10000);

        b.deposit(5000);
        b.withdraw(2000);

        System.out.println("Account: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}
.....................Student Details..........................
  class Student {

    private String name;
    private int age;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Ravi");
        s.setAge(20);
        s.setMarks(85);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Marks: " + s.getMarks());
    }
}
