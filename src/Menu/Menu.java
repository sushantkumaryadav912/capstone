package Menu;

import StudentManagement.StudentManagement;
import EmployeeManagement.EmployeeManagement;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Select an option: ");
            switch (choice) {
                case 1:
                    StudentManagement.main(new String[0]);
                    break;
                case 2:
                    EmployeeManagement.main(new String[0]);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
        System.out.println("Exiting menu.");
    }

    private void printMenu() {
        System.out.println("\n=== Main Menu ===");
        System.out.println("1. StudentManagement");
        System.out.println("0. Exit");
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            }
            sc.nextLine();
            System.out.println("Please enter a number.");
        }
    }
}
