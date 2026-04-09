package capstone_april;

import java.util.*;

class ListNode14{

    int val;
    ListNode14 next;

    public ListNode14(int i) {
        this.val=i;
    }
}

public class problem14 {
    public static void main(String[] args){
        ListNode14 l1=new ListNode14(1);
        l1.next=new ListNode14(4);
        l1.next.next=new ListNode14(5);


        ListNode14 l2=new ListNode14(1);
        l2.next=new ListNode14(3);
        l2.next.next=new ListNode14(5);

        ListNode14 l3=new ListNode14(2);
        l3.next=new ListNode14(6);

        ListNode14[] lists={l1,l2,l3};

        ListNode14 result = mergeLists(lists);

        System.out.print("Merged List: ");
        printList(result);
    }

    static void printList(ListNode14 head){
       while(head!=null){
           System.out.print(head.val+" ");
           head=head.next;
       }
    }

    static ListNode14 mergeLists(ListNode14[] lists){
        PriorityQueue<ListNode14> pq=new PriorityQueue<>((a,b)->Integer.compare(a.val, b.val));
        for(ListNode14 node:lists){
            if (node!=null){
                pq.add(node);
            }
        }
        ListNode14 dummy=new ListNode14(-1);
        ListNode14 curr=dummy;

        while(!pq.isEmpty()){
            ListNode14 minNode=pq.poll();
            curr.next=minNode;
            curr=curr.next;
            if (minNode.next!=null){
                pq.add(minNode.next);
            }
        }
        return dummy.next;
    }
}
