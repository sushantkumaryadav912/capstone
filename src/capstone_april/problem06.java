package capstone_april;

// jack is always excited about sunday and it is his favouriate day
// he gets to play full day on sunday so he counts the sundays at the starting of each month 

import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days in the month:");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Number of days must be an integer.");
            return;
        }
        int numDays = sc.nextInt();

        System.out.println("Enter the day of the week for the first day of the month (0 for Sunday, 1 for Monday, ..., 6 for Saturday):");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. First day must be an integer between 0 and 6.");
            return;
        }
        int firstDay = sc.nextInt();

        if (numDays < 28 || numDays > 31) {
            System.out.println("Invalid month length. Enter a value between 28 and 31.");
            return;
        }

        if (firstDay < 0 || firstDay > 6) {
            System.out.println("Invalid first day. Enter a value between 0 and 6.");
            return;
        }

        int firstSundayDate = (firstDay == 0) ? 1 : (8 - firstDay);
        int sundayCount = 0;

        if (firstSundayDate <= numDays) {
            sundayCount = 1 + (numDays - firstSundayDate) / 7;
        }

        System.out.println("Number of Sundays in the month: " + sundayCount);
    }
}
