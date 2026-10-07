
import java.util.Scanner;

public class StudentManagementSystem {
    
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    tools.addStudent();
                    break;
                case 2:
                    tools.viewStudents();
                    break;
                case 3:
                    tools.searchStudent();
                    break;
                case 4:
                    tools.deleteStudent();
                    break;
                case 5:
                    System.out.println("Thank you for using Student Management System.");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 5);

    }
}
