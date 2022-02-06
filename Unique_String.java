// Write a program to input a string and check if it is a unique string or not.

import java.util.*;
public class Unique_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str = str.toUpperCase();
        int l = str.length();
        int n = 0; //counter variable to count repetitions
        for (int i = 0; i < l - 1; i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < l; j++) {
                char ch1 = str.charAt(j); // stores the next character
                // Compares each character to rest of the characters
                if (ch == ch1) {
                    n++;
                    break;
                }
            }
        }
        if (n >= 1)
            System.out.println("It is not a unique string");
        else
            System.out.println("It is a unique string");
    }
}