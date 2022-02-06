// Write a program to input a 3x3 matrix and print those rows and columns whose sum is same. If none found, print the relevant message. 

import java.util.*;
public class Sum_Row_Column {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i, j, k, l, srow = 0, scol = 0, f = 0;
        System.out.println("Enter elements");
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        for (i = 0; i < 3; i++) {
            for (l = 0; l < 3; l++)
                srow = srow + a[i][l];
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++)
                    scol = scol + a[k][j];
                if (srow == scol) {
                    System.out.println("\nRow Elements");
                    for (l = 0; l < 3; l++)
                        System.out.print(a[i][l]);
                    System.out.println("\nColumn Elements");
                    for (k = 0; k < 3; k++)
                        System.out.print(a[k][j]);
                    f = 1;
                }
                scol = 0;
            }
            srow = 0;
        }
        if (f == 0) {
            System.err.println("No such combination");
        }
    }
}