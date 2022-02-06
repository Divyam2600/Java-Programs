/*
Write a program to declare a square matrix of order M x M where ‘M’ is the number of rows and the number of columns, such that M must be greater than 2 and less than 10. Accept the value of M as user input. Display an appropriate message for an invalid input. Allow the user to input integers into this matrix. Perform the following tasks:

(a) Display the original matrix.
(b) Rotate the matrix 90° clockwise as shown below:

 Original matrix           Rotated matrix
   1 2 3                   7 4 1
   4 5 6                   8 5 2
   7 8 9                   9 6 3
*/
import java.util.*;

public class Matrix_Rotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int m = sc.nextInt();
        if (m < 3 || m > 9)
            System.err.println("Input Out Of Range");
        else {
            int A[][] = new int[m][m];
            // Inputting elements in the matrix
            System.out.println("\nEnter the elements in the matrix");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            // Printing the original matrix
            System.out.println("\nThe Original Matrix is : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            // Rotating the matrix column-wise
            int B[][] = new int[m][m];
            int x;
            for (int i = 0; i < m; i++) {
                x = m - 1;
                for (int j = 0; j < m; j++) {
                    B[i][j] = A[x][i];
                    x--;
                }
            }
            // Printing the rotated matrix
            System.out.println("\nMatrix After Rotation is : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }
        }
    } // main
} // class