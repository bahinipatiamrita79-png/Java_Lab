class Student {
    int roll;
    String name;

    // Parameterized Constructor
    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Amrita");
        s1.display();
    }
}
