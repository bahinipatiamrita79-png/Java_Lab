import java.util.*;

abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(int acc, String n, String add, double bal) {
        accountNumber = acc;
        name = n;
        address = add;
        balance = bal;
    }

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println("Acc No: " + accountNumber + " Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rate;

    SavingsAccount(int acc, String n, String add, double bal, double r) {
        super(acc, n, add, bal);
        rate = r;
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance");
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("After Interest: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Amrita", "Kolkata", 10000, 5);

        s.deposit(2000);
        s.withdraw(3000);
        s.calculateAmount();
        s.display();
    }
}
