import java.util.*;

interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll_no;
    double m1, m2;

    void get(Scanner sc) {
        name = sc.nextLine();
        roll_no = sc.nextInt();
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
    }

    void show() {
        System.out.println(name + " " + roll_no);
        System.out.println("Marks: " + m1 + " " + m2);
    }
}

class Result extends Student implements Exam {
    double per;

    public void percent_cal() {
        per = (m1 + m2) / 2;
    }

    void display() {
        show();
        System.out.println("Percentage: " + per);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        r.get(sc);
        r.percent_cal();
        r.display();
    }
}
