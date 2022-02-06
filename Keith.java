/*
Write a program to input a number and check if it is a Keith Number.
A number is called Keith number if it appears in a special sequence generated using its digits.
Example:-
197 is a Keith number because,
197 has 3 digits, so n = 3
The number(197)appears in the special sequence that has first three terms as 1, 9, 7 and remaining terms evaluated using sum of previous 3 terms.
1, 9, 7, 17, 33, 57, 107, 197.
*/

import java.util.*;

public class Keith {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, sum = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int copy = num;
        String n0 = Integer.toString(num);
        int l = n0.length();
        int m[] = new int[num];
        i = l - 1;
        while (copy != 0) {
            m[i] = copy % 10;
            copy = copy / 10;
            i--;
        }
        i = l;
        while (sum < num) {
            sum = 0;
            for (int j = 1; j <= l; j++) {
                sum = sum + m[i - j];
            }
            m[i] = sum;
            i++;
        }
        for (int j = 0; j < i; j++)
            System.out.print(m[j] + " ");
        if (sum == num)
            System.out.println("\n" + num + " is a Keith Number");
        else
            System.out.println("\n" + num + " is not a Keith Number");
    }
}