/*
Write a program to input a number and check if it is a Disarium Number.
A number is called Disarium if sum of its digits powered with their respective positions is equal to the number itself.
Example:-
135 is a Disarium number because,
135 ⇒ 1^1 + 3^2 + 5^3 = 135. So, 135 is a Disarium number.
*/

import java.util.*;

public class DisariumNumber {
    public static void main(String[] args) {
        int num, sum = 0, rem = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        int len = 0;
        int no = num;
        while (no != 0) {
            len = len + 1;
            no = no / 10;
        }
        // Makes a copy of the original number num
        n = num;

        // Calculates the sum of digits powered with their respective position
        while (num > 0) {
            rem = num % 10;
            sum = sum + (int) Math.pow(rem, len);
            num = num / 10;
            len--;
        }

        // Checks whether the sum is equal to the number itself
        if (sum == n)
            System.out.println(n + " is a disarium number");
        else
            System.out.println(n + " is not a disarium number");
    }
}