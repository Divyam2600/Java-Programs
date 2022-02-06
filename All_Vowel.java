// Write a program to input a sentence and print all words that contain every vowel in it. If none found, print a relevant message.

import java.util.*;

public class All_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        s = s.trim();
        s = s + " ";
        String st = "";
        int count = 0, f = 0;
        char p = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                st = st + s.charAt(i);
            } else {
                for (int j = 0; j < st.length(); j++) {
                    if (st.charAt(j) != ' ') {
                        p = st.charAt(j);
                        if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u') {
                            count++;
                        }
                    }
                }
                if (count >= 5) {
                    System.out.println(st);
                    f++;
                }
                count = 0;
                st = " ";
            }
        }
        if (f == 0) {
            System.err.println("No words with all vowels found");
        }
    }
}