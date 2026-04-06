package capstone_april;
import java.util.Scanner;
// payment gateway st=ystem an e-commerce website uses
// upi payment
// card payment
//both have processpayment() method
// a hybrid payment system supports  both

interface UPIPayment
{
    default void processUPIPayment()
    {
        System.out.println("Processing UPI Payment\n");
    }
}

interface CardPayment
{
    default void processCardPayment()
    {
        System.out.println("Payment processed uisng card\n");
    }
}

class HybridPaymentSystem implements UPIPayment, CardPayment
{
    Scanner sc = new Scanner(System.in);
    public void processPayment()
    {
        System.out.println("Choose payment mode:");
        System.out.println("\nChoice 1:UPI payment");
        System.out.println("\nChoice 2: Card Payment");
        System.out.println("\n Choice:");
        int ch=sc.nextInt();

        if(ch==1)
        {
            UPIPayment.super.processPayment();
        }
        else if (ch==2) {
        {
            CardPayment.super.processCardPayment();
        }
        else
        {
            System.out.println("Invalid choice");

        }
    }
}

public class problem02 {
    public static void main(String[] args) {
        HybridPaymentSystem op = new HybridPaymentSystem();
        while(true)
        {
            op.processPayment();
        }
    }
}
