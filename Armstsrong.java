/*
An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
Example:
153 is an Armstrong number.
153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
*/
import java.util.*;

public class Armstsrong {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        if (isArmstrong(num))
            System.out.print("It is an Armstrong Number");
        else
            System.out.println("It is not an Armstrong Number");  
    }
}