
import java.util.ArrayList;
import java.util.Scanner;

public class tools {
     static ArrayList<Student> students = new ArrayList<>();
     static Scanner sc = new Scanner(System.in);

    static void addStudent() {
       
        System.out.print("Enter ID: ");
        
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Semester: ");
        String semester = sc.nextLine();

        Student s = new Student(id, name, department, semester);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to show.");
            return;
        }
        System.out.println("Student List");
        for (Student s : students) {
            s.display();
            System.out.println("-------------------");
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found!");
                s.display();
                return; 
            }
        }
        System.out.println("No student found with ID: " + id);
    }


    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("No student found with ID: " + id);
    }
    
}
