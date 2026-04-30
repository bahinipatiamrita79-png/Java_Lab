import java.util.*;
interface Department {
    String deptName = "";
    String deptHead = "";
    void printDepartment();
}
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine(); // consume newline
    }
    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}
class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;
    String deptName;
    String deptHead;
    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
        System.out.print("Enter Department Head: ");
        deptHead = sc.nextLine();
        getHostelData(sc);
    }
    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printDepartment();
        printHostelData();
    }
    public void printDepartment() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.getData(sc);
                    list.add(s);
                    System.out.println("Student admitted successfully!");
                    break;
                case 2:
                    System.out.print("Enter Registration Number to migrate: ");
                    int reg = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Student stu : list) {
                        if (stu.regdNo == reg) {
                            System.out.println("Enter new hostel details:");
                            stu.getHostelData(sc);
                            System.out.println("Student migrated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("No student records available.");
                    } else {
                        for (Student stu : list) {
                            stu.printData();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
