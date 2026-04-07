package capstone_april;


import java.util.*;
import static java.util.Collections.sort;

// sort a stack using another stack(sort the stack in ascending order by using another stack)
public class problem07 {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack();
        int[] arr={34,3,31,98,92,23};
        for (int i=0;i<6;i++){
            stack.push(arr[i]);
        }
        System.out.println("Original Stack: "+stack);
        sort(stack);
        System.out.println("Sorted Stack: "+stack);
    }
    static void sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
