// Write a program to input numbers into a m x n matrix and print the original matrix and sum of its boundary and non-boundary elements separately.

import java.util.*;

public class Boundary_Sum {
    public static void main(String[] args) {
        int i, j, sb = 0, sn = 0, m, n;
        Scanner sc = new Scanner(System.in);
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
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    sb = sb + a[i][j];
                } else {
                    sn = sn + a[i][j];
                }
            }
        }
        System.out.println("\nSum of Boundary Elements is = " + sb);
        System.out.println("\nSum of Non-Boundary Elements is = " + sn);
    }
}