import java.util.*;

interface Gross {
    double calcGross();
}

class Employee {
    String name;
    int id;

    void get(Scanner sc) {
        name = sc.nextLine();
        id = sc.nextInt();
        sc.nextLine();
    }

    void show() {
        System.out.println(name + " " + id);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    void getSal(Scanner sc) {
        basic = sc.nextDouble();
        hra = sc.nextDouble();
        da = sc.nextDouble();
    }

    public double calcGross() {
        return basic + hra + da;
    }

    void display() {
        show();
        System.out.println("Gross Salary: " + calcGross());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();

        s.get(sc);
        s.getSal(sc);
        s.display();
    }
}
