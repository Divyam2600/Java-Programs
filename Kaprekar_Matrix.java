// Write a program to input numbers into a m x n matrix and print all the Kaprekar numbers(if any) else print a relevant message.

import java.util.*;

public class Kaprekar_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n, c = 0;
        System.out.println("Enter the size of matrix");
        System.out.print("\nNo of rows: ");
        m = sc.nextInt();
        System.out.print("\nNo of columns: ");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("\nEnter the elements in the matrix");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nKaprekar Numbers: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (Kaprekar_Check(a[i][j])) {
                    c++;
                    System.out.print("\n" + a[i][j]);
                }
            }
        }
        if (c == 0) {
            System.err.print("Not Found.");

        }
    }
    public static boolean Kaprekar_Check(int n) {
        int b, c = 0, sqr, quo, rem, sum = 0, d;
        b = n;
        while (b != 0) {
            d = b % 10;
            c++; // count the digits
            b = b / 10;
        }
        sqr = n * n;
        quo = sqr / (int) Math.pow(10, c); // left half of square of number
        rem = sqr % (int) Math.pow(10, c); // right half of square of number
        sum = quo + rem; // sum of the two halves
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}