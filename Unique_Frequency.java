
/*
A unique-digit integer is a positive integer (without leading zeros) with no duplicate digits. For example 7, 135, 214 are all unique-digit integers whereas 33, 3121, 300 are not. 

Given two positive integers m and n, where m < n,and m < 30000 and n < 30000, write a program to determine how many unique-digit integers are there in the range between m and n (both inclusive) and print them. 
You are required to print the number of unique-digit integers in the specified range along with their values in the format specified below:

Example:-
INPUT:     
m = 100 
n = 120 

OUTPUT:     
THE UNIQUE-DIGIT INTEGERS ARE: 
102, 103, 104, 105, 106, 107, 108, 109, 120 
FREQUENCY OF UNIQUE-DIGIT INTEGERS IS: 9 
*/
import java.util.*;

public class Unique_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, b, c = 0, revb, sqra, sqrb, count = 0;
        System.out.println("Enter the range: ");
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        if (!(m > 0 && n > 0 && m < n && m < 30000 && n < 30000)) {
            System.err.println("Invalid Range");
            System.exit(0);
        } else {
            System.out.println("\nTHE UNIQUE-DIGIT INTEGERS ARE:");
            for (i = m; i <= n; i++) {
                if (unique(i)) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            if (count == 0)
                System.out.println("NIL");
            System.out.println("\nFREQUENCY OF UNIQUE-DIGIT INTEGERS IS:" + count);
        }
    }
    public static boolean unique(int n) {
        int c = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = n; j > 0; j = j / 10) {
                if (i == j % 10)
                    c++;
            }
            if (c > 1)
                return false;
            c = 0;
        }
        return true;
    }
}