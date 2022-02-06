/*
The names of the teams participating in a competition should be displayed on a banner vertically, to accommodate as many teams as possible in a single banner. 
Design a program to accept the names of N teams, where 2 < N < 9 and display them in vertical order, side by side with a horizontal tab (i.e. eight spaces).If N is not within the range, print a relevant error message.

Example:

INPUT:
Enter the number of teams
N = 3
Team 1:Tesla
Team 2:Tata
Team 3:Renault

OUTPUT
T    T    R    
E    A    E    
S    T    N    
L    A    A    
A         U    
          L    
          T
*/

import java.util.*;

public class Banner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, len = 0;
        System.out.println("Enter the number of teams");
        System.out.print("N = ");
        N = sc.nextInt();
        sc.nextLine();
        if (N > 2 && N < 9) {
            String m[] = new String[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Team " + (i + 1) + ":");
                m[i] = sc.nextLine();
                m[i] = m[i].toUpperCase();
                if (m[i].length() > len) // find longest length
                    len = m[i].length();
            }
            System.out.println("\nOUTPUT");
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < N; j++) {
                    if (i < m[j].length())
                        System.out.print(m[j].charAt(i) + "\t");
                    else
                        System.out.print(" " + "\t");
                }
                System.out.println();
            }
        } else
            System.err.println("INVALID INPUT");
    }
}