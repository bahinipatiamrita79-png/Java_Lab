class Student {
    int roll;
    String name;

    Student() {
        roll = 0;
        name = "Unknown";
    }

    Student(int r) {
        roll = r;
        name = "Not Assigned";
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Amrita");

        s1.display();
        s2.display();
        s3.display();
    }
}
