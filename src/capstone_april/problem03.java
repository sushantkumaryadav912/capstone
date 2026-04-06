package capstone_april;
// Employee management system(Diamond Structure)
// this is the classis structure A-->B, C--D structure

// create a realtime employee notification system
// A =employee
// B = Email notification
// C = SMS Notification
// D = Manager
//Both B and C inherit from A


interface Employee {
    default void notifyEmployee() {
        System.out.println("Notifying employee...");
    }
}

interface EmailNotification extends Employee {
    default void sendEmail() {
        System.out.println("Sending email notification...");
    }
}

interface SMSNotification extends Employee {
    default void sendSMS() {
        System.out.println("Sending SMS notification...");
    }
}

interface Manager extends EmailNotification, SMSNotification {
    default void notifyManager() {
        System.out.println("Notifying manager...");
    }
}

public class problem03 {
    public static void main(String[] args)
}
