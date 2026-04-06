package capstone_april;

import java.util.Scanner;

// payment gateway system an e-commerce website uses
// upi payment
// card payment
// both have separate methods
// a hybrid payment system supports both

interface UPIPayment {
    default void processUPIPayment() {
        System.out.println("Processing UPI payment");
    }
}

interface CardPayment {
    default void processCardPayment() {
        System.out.println("Payment processed using card");
    }
}

class HybridPaymentSystem implements UPIPayment, CardPayment {
    private final Scanner sc;

    HybridPaymentSystem(Scanner sc) {
        this.sc = sc;
    }

    public boolean processPayment() {
        System.out.println("\nChoose payment mode:");
        System.out.println("1: UPI payment");
        System.out.println("2: Card payment");
        System.out.println("3: Exit");
        System.out.print("Choice: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next(); // consume invalid token
            return true;
        }

        int ch = sc.nextInt();

        if (ch == 1) {
            UPIPayment.super.processUPIPayment();
        } else if (ch == 2) {
            CardPayment.super.processCardPayment();
        } else if (ch == 3) {
            System.out.println("Exiting payment system.");
            return false;
        } else {
            System.out.println("Invalid choice");
        }

        return true;
    }
}

public class problem02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            HybridPaymentSystem op = new HybridPaymentSystem(sc);
            while (op.processPayment()) {
            }
        }
    }
}
