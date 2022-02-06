// Write a program to input numbers into a m x n matrix and sort the major and minor diagonal elements in ascending order and print the original and sorted array.

import java.util.*;

public class Sort_Major_Minor {
    public static void main(String[] args) {
        int i, j, m, n, x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        System.out.print("\nNo of rows: ");
        m = sc.nextInt();
        System.out.print("\nNo of columns: ");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        if (m != n) {
            System.err.println("Error: It has to be a square matrix ,i.e, rows has to be equal to columns");
        } else {
            System.out.println("\nEnter the elements in the matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("\nOriginal Matrix:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            int ma[] = new int[m];
            int mi[] = new int[m];
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if (i == j) {
                        ma[x++] = a[i][j]; // Store the major diagonal elements
                    }
                    if (i + j == m - 1) {
                        mi[y++] = a[i][j]; // Store the minor diagonal elements
                    }
                }
            }
            int arr1[] = Sort(ma); // Store the major diagonal elements after sorting
            int arr2[] = Sort(mi); // Store the minor diagonal elements after sorting
            int p = 0, q = 0;
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    // Interchange the previous major diagonal elements with sorted ones
                    if (i == j) {
                        a[i][j] = arr1[p++];
                    }
                    // Interchange the previous minor diagonal elements with sorted ones
                    if (i + j == m - 1) {
                        a[i][j] = arr2[q++];
                    }
                }
            }
            System.out.println("\nSorted Matrix:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static int[] Sort(int a[]) {
        int i, t;
        for (i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }
}