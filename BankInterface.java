import java.util.*;

interface Bank {
    void deposit(double a);
    void withdraw(double a);
    void show();
}

class Customer {
    String name;
    int id;

    void get(Scanner sc) {
        name = sc.nextLine();
        id = sc.nextInt();
        sc.nextLine();
    }

    void showC() {
        System.out.println(name + " " + id);
    }
}

class Account extends Customer implements Bank {
    int accNo;
    double bal;

    void getAcc(Scanner sc) {
        accNo = sc.nextInt();
        bal = sc.nextDouble();
    }

    public void deposit(double a) {
        bal += a;
    }

    public void withdraw(double a) {
        if (a <= bal) bal -= a;
        else System.out.println("Insufficient");
    }

    public void show() {
        showC();
        System.out.println(accNo + " " + bal);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        a.get(sc);
        a.getAcc(sc);

        int ch;
        do {
            System.out.println("1.Deposit 2.Withdraw 3.Show 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) a.deposit(sc.nextDouble());
            else if (ch == 2) a.withdraw(sc.nextDouble());
            else if (ch == 3) a.show();

        } while (ch != 4);
    }
}
