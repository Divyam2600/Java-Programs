/* 
Write a program to input a sentence or a string and check if it is a Global Sentence.
A Global Sentence is one that contains all the 26 alphabets
*/
import java.util.*;

public class Global_Sentence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s = sc.nextLine();
        int l = s.length();
        int index = 0, flag = 0;
        boolean[] visited = new boolean[26];
        for (int i = 0; i < l - 2; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (Character.isLetter(ch) == true) {
                    if (ch >= 'a' && ch <= 'z') {
                        index = ch - 'a';
                    } else if (ch >= 'A' && ch <= 'Z') {
                        index = ch - 'A';
                    }
                    visited[index] = true;
                }
            }
        }
        for (int id = 0; id < 26; id++) {
            //If any element of boolean array is false or empty
            if (!visited[id]) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("\nIt is a Global Sentence");
        } else {
            System.err.println("\nIt is not a Global Sentence");
        }
    }
}