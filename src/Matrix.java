//Question 2 : Write a program that will print the sum of diagonal elements of a 10X10 matrix. The program will take a total of 100 numbers as input (10 numbers will be input per line and each number will be separated by a space).

//Example 1:
//Input:  1234567890
//        0123456780
//        3456789640
//        2345678932
//        3456743213
//        3456244246
//        2346246235
//        2356246235
//        2462143352
//        3352462146
//Output:42

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10][10];
        System.out.println("Enter 100 numbers (10 numbers per line):");


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < 10; i++) {
            diagonalSum += matrix[i][i];
            diagonalSum += matrix[i][9 - i];
        }

        System.out.println("Sum of diagonal elements: " + diagonalSum);
        scanner.close();
    }
}
