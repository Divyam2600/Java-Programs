// Write a program to input numbers into a m x n matrix and check if its a Symmetric matrix.

import java.util.*;

public class Symmetric_Matrix {
    public static void main(String[] args) {
        int i, j, m, n, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        System.out.print("\nNo of rows: ");
        m = sc.nextInt();
        System.out.print("\nNo of columns: ");
        n = sc.nextInt();
        if (m != n) {
            System.err.println("Error: It has to be a square matrix ,i.e, rows has to be equal to columns");
        } else {

            int a[][] = new int[m][n];
            int b[][] = new int[m][n];
            System.out.println("\nEnter the elements in the matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            // Transpose of the matrix
            for (i = 0; i < m; i++) {
                for (j = i; j < n; j++) {
                    int temp = a[i][j];
                    b[i][j] = a[j][i];
                    b[j][i] = temp;
                }
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    // Checks if the transpose is equal to original
                    if (b[i][j] == a[i][j]) {
                        c = 1;
                    } else {
                        c = 0;
                        break;
                    }
                }
            }
            System.out.println(c == 1 ? "The matrix is Symmetric." : "The matrix is not Symmetric.");
        }

    }
}