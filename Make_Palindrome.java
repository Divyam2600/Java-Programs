/*
Write a program to accept a sentence which ends by either '.', '?' or '!' only. The words are to be entered by a single blank space and are in UPPER CASE.
Perform the following tasks:
(a) Check for validity for the entered sentence.
(b) Convert the non-palindrome words of the sentence into palnidrome words by
concatenating the word by its revers (excluding the last character).
Example: The reverse of the word HELP would be LEH (omitting the
last alphabet) and by concatenating both, the new palindrome word is HELPLEH.
Thus the word HELP become HELPLEH
Note: The words which end with repeated alphabets, for example ABB would
become ABBA and not ABBBA and XAZZZ becomes XAZZZAX.
(c) Display the original sentence along with converted sentence.
 */

import java.util.*;

public class Make_Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s = sc.nextLine();
        int l = s.length();
        char ch = s.charAt(l - 1);
        if (!(ch == '.' || ch == '?' || ch == '!')) {
            System.err.println("INVALID INPUT");
            System.exit(0);
        }
        for (int i = 0; i < l - 1; i++) {
            char ch1 = s.charAt(i);
            if (ch1 != ' ') {
                if (Character.isLetter(ch1) == false) {
                    System.err.println("INVALID INPUT");
                    return;
                }
            }
        }
        String w = "", r = "";
        String ns = s.substring(0, l - 1);
        ns = ns + " ";
        for (int i = 0; i < ns.length(); i++) {
            if (ns.charAt(i) != ' ') {
                w = w + ns.charAt(i);
                r = ns.charAt(i) + r;
            } else {
                if (w.equals(r))
                    System.out.print(w + " ");
                else {
                    System.out.print(w.substring(0, w.length() - 1));
                    for (int j = 0; j < r.length() - 1; j++) {
                        if (!(r.charAt(j) == r.charAt(j + 1))) {
                            System.out.print(r.substring(j));
                            break;
                        }
                    }
                }
                System.out.print(" ");
                w = "";
                r = "";
            }
        }
    }
}