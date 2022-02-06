/*
A Palindrome number is a number that is equal its reverse.
Example:
121 is an Armstrong number.
*/

import java.util.*;

public class Palindrome{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrome(n) == true){
            System.out.println(n +" is a Palindrome Number");
        }
        else{
            System.out.println(n +" is not a Palindrome Number");
        }
    }
    static boolean isPalindrome(int N){
        int rev = 0;
        int num = N;
        while(num>0){
            int f = num/10;
            int s = f*10;
            int digit = num - s;
            rev = rev*10 + digit;
            num/= 10;
        }
        if(rev == N){
            return true;
        }
        else{
            return false;
        }
    }
}