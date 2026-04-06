package capstone_april;

//Q : 3- Employee Management System (Diamond Structure)
//this is a classic diamond structure A-->B,C-->D structure

//Q- create a real time  employee management notification system.
//* A = Employee 
//* B = Email Notification
//* C = SMS Notification 
//* D = Manager
//Both B and C inherit from A



interface Employee
{
    void notifyEmployee();
}
interface EmailNotification
{
    default void notifyEmployee()
    {
        System.out.println("Notification sent via email");
    }
}

interface SMSNotification
{
    default void notifyEmployee()
    {
        System.out.println("Notification sent via SMS");
    }
}

class Manager implements EmailNotification,SMSNotification
{
    public void notifyEmployee()
    {
        EmailNotification.super.notifyEmployee();
        SMSNotification.super.notifyEmployee();

    }
}

public class problem03 {

    public static void main(String[] args) {

        Manager m=new Manager();
        m.notifyEmployee();


    }

}