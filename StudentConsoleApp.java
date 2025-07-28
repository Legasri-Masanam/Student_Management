import java.util.*;

public class StudentConsoleApp {
    private static Scanner sc = new Scanner(System.in);
    private static StudentServices studentServices = new StudentServicesIMPL();
    public static void main(String[] args){
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Display Topper");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice){
            case 1 -> addStudent();
            case 2 -> studentServices.viewallStudents();
            case 3 -> searchStudent();
            case 4 -> deleteStudent();
            case 5 -> updateStudent();
            case 6 -> displayTopper();
            case 7 -> {
                System.out.println("Exiting...");
                return;
            }
            default -> System.out.println("Invalid choice!");
        }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        Student student = new Student(roll, name, age, grade, marks);
        studentServices.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        Student s = studentServices.getStudentByRollNo(roll);
        if (s != null) System.out.println(s);
        else System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        if (studentServices.deleteStudent(roll))
            System.out.println("Deleted successfully.");
        else
            System.out.println("Student not found.");
    }

    private static void updateStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("What do you want to update (name/age/grade/marks): ");
        String field = sc.nextLine();
        if (field.equalsIgnoreCase("marks")) {
            if (studentServices.updateStudent(roll, field, "")) {
                System.out.println("Marks updated.");
            } else {
                System.out.println("Student not found.");
            }
        } else {
            System.out.print("Enter new value: ");
            String value = sc.nextLine();
            if (studentServices.updateStudent(roll, field, value))
                System.out.println("Updated successfully.");
            else
                System.out.println("Student not found or invalid field.");
        }
    }

    private static void displayTopper() {
        Student topper = studentServices.getTopper();
        if (topper != null)
            System.out.println("Topper: " + topper);
        else
            System.out.println("No students available.");
    }
}