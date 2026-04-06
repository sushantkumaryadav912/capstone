//package capstone_april;
//
////You're given an array A of n integers and q queries.
////Each query can be one of the following two types:
////Type 1 Query: (1, 1, r) - Replace A[i] with (i - l + 1) ^ * A[I] for each index i, where 1 <= i <= r
////Type 2 Query: (2, 1, r) - Calculate the sum of the elements in A from index I to index r.
////Find the sum of answers to all type 2 queries. Since answer can be large, return it modulo 109+7.
//
//import java.util.*;
//public class problem05 {
//    public static void  main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n = sc.nextInt();
//
//        int[] A = new int[n];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter element " + (i + 1) + ":");
//            sc.nextInt();
//        }
//        System.out.print("Enter the number of queries:");
//        int query = sc.nextInt();
//        int totalSum = 0;
//        for (int q = 1; q <= query; q++) {
//            System.out.print("Enter the type of " + q + "query:");
//            int type = sc.nextInt();
//            System.out.print("Enter the starting index of the " + q + "query");
//            int L = sc.nextInt();
//            System.out.print("Enter the ending index of the " + q + "query");
//            int r = sc.nextInt();
//            if (type == 1) {
//                for (int i = L; i <= r; i++) {
//                    A[i] = ((i - L + 1) * A[L]);
//                }
//            } else if (type == 2) {
//                int sum = 0;
//                for (int i = L; i <= r; i++) {
//                    sum = sum + A[i];
//                }
//                totalSum = totalSum = sum;
//            }
//        }
//        System.out.println("\nTotal sum of all type of 2 queries: " + totalSum);
//        sc.close();
//    }
//}

package capstone_april;
import java.util.*;

public class problem05 {



    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n=sc.nextInt();

        int [] A = new int[n];
        System.out.print("\nEnter the elements of the Array : ");

        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the " +(i+1)+ " Element :");
            A[i]=sc.nextInt();
        }

        System.out.println("Enter the total Queries : ");
        int q=sc.nextInt();
        int totalsum=0;
        for (int j=1;j<q;j++)
        {
            System.out.println("\nEnter the"+j+" Query :");
            System.out.print("\nEnter the type of "+j+" Query :");
            int type =sc.nextInt();
            System.out.println("Enter the Starting index of "+j+" Query :");
            int L=sc.nextInt();
            System.out.println("Enter the Ending index of "+j+" Query :");
            int R=sc.nextInt();


            if (type==1) //Replace the array
            {
                for(int k=L;k<=R;k++) {
                    A[k]=((k-L+1)*A[L]);
                }
            }
            else if(type==2) //Sum of the array
            {

                int sum=0;
                for(int k=L;k<=R;k++) {
                    sum=sum+A[k];
                }


                totalsum=sum+totalsum;
            }
        }



        System.out.println("\nTotal sum of all type 2 Queries : "+totalsum);
        sc.close();





    }

}