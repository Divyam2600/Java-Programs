//Write a program to input a number and print the new number by removing all duplicate digits

import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n;
        n = sc.nextInt();
        int num = n;
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        } //Counting the number of digits
        int a[] = new int[c];
        int no = n;
        int x = 0, r;
        while (no > 0) {
            r = no % 10;
            a[x++] = r;
            no /= 10;
        } //Storing all digits in an array
        int newnum = 0;
        int p = 0, count = 0;
        for (int i = 0; i < a.length; i++) {
            num = a[i];
            for (int j = i; j < a.length; j++) {
                if (num == a[j]) {
                    count++;
                }
            } //Counting for number of occurences of digit
            if (count == 1) {
                newnum = newnum + num * (int) Math.pow(10, p++);
            } //Creating the new number
            count = 0;
        }
        System.out.println(newnum);
    }
}