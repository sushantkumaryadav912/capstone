package capstone_april;

//Uses floyd algorithm to detect cycle
//cycle detection and remove

//this node class representing single node in our linkedlist.
class Node_SIT
{
    int data;
    Node_SIT next;
    Node_SIT(int data)
    {
        this.data=data;
    }

}
public class problem08 {


    public static void main (String[]args)

    {
        //DECLARATION - INITIALIZATION
        Node_SIT head=new Node_SIT(10);
        head.next=new Node_SIT(20);
        head.next.next=new Node_SIT(30);
        head.next.next.next=new Node_SIT(40);
        head.next.next.next.next=new Node_SIT(50);
        //node 50 points back to the node 20.
        head.next.next.next.next.next=head.next;



        boolean hasCycle=detectCycle(head);
        printList(head);


    }

    static boolean detectCycle(Node_SIT head )

    {
        Node_SIT slow=head;
        Node_SIT fast=head;
        while(fast!= null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;


            if(slow==fast) {//this point is called the meeting point.
                removeCycle(head,slow);
                return true;
            }

        }
        return false;


    }

    static void removeCycle(Node_SIT head,Node_SIT meetingPoint)
    {
        Node_SIT start=head;
        while(start.next!=meetingPoint.next)
        {
            start=start.next;
            meetingPoint=meetingPoint.next;
        }
        meetingPoint.next=null;

    }

    static void printList(Node_SIT head )
    {
        Node_SIT current =head;
        while(current !=null) {
            System.out.println(current.data+ " ");
            current=current.next;
        }


    }

}