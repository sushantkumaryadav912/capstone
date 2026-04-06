package capstone_april;
//Home assignment:
//
// Employee management system(Diamond Structure)
// this is the classis structure A-->B, C--D structure

// create a realtime employee notification system
// A =employee
// B = Email notification
// C = SMS Notification
// D = Manager
//Both B and C inherit from A




interface Employee {
    void notifyEmployee();
}

interface EmailNotification{
    default notifyEmployee()
    {

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
