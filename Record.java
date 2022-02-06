/*

A superclass Record contains names and marks of the students in two different single dimensional arrays. 
Define a subclass Highest to display the names of the students obtaining the highest mark.

The details of the members of both classes are given below:


Class name: Record

Data member/instance variable:
n[] : array to store names
m[]: array to store marks
size: to store the number of students

Member functions/methods:
Record(int cap): parameterized constructor to initialize the data member ,size = cap
void readarray() : to enter elements in both the arrays
void display() : displays the array elements


Class name: Highest

Data member/instance variable:
ind: to store the index

Member functions/methods:
1) Highest(…): parameterized constructor to initialize the data members of both the classes
2) void find(): finds the index of the student obtaining the highest mark and assign it to ‘ind’
3) void display(): displays the array elements along with the names and marks of the students who have obtained 
   the highest mark

Assume that the superclass Record has been defined. Using the concept of inheritance, specify the class Highest 
giving the details of the constructor(…), void find() and void display().
The main function and algorithm need NOT be written.

*/


import java.util.Scanner;

class Record {
    String n[];
    int m[];
    int size;
    public Record(int cap) {
        size = cap;
    }
    //To Input The Names and Marks of the Students
    public void readarray() {
        m = new int[size];
        n = new String[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Names of The Students");
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextLine();
        }
        System.out.println("Marks of The Students");
        for (int i = 0; i < size; i++) {
            m[i] = sc.nextInt();
        }
    }
    //To Display The Names and Marks of Each Student 
    public void display() {
        System.out.println("");
        System.out.println("Names and Marks of The Students: ");
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ") " + " " + n[i] + "  - " + m[i]);
        }
    }
} //Record