/*
Design a class name ShowRoom with the following description :
Instance variables/ Data members :-

String name – To store the name of the customer
long mobno – To store the mobile number of the customer
double cost – To store the cost of the items purchased
double dis – To store the discount amount
double amount – To store the amount to be paid after discount

Member methods:–

ShowRoom() – default constructor to initialize data members
void input() – To input customer name, mobile number, cost
void calculate() – To calculate discount on the cost of purchased items, based on following criteria:

        Cost	                                           Discount (in percentage)
Less than or equal to ₹ 10000	                                5%
More than ₹ 10000 and less than or equal to ₹ 20000	        10%
More than ₹ 20000 and less than or equal to ₹ 35000	        15%
More than ₹ 35000	                                        20%

void display() – To display customer name, mobile number, amount to be paid after discount
Write a main method to create an object of the class and call the above member methods.
*/

import java.util.*;
public class ShowRoom {
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    ShowRoom() {
        name = " ";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the customer:");
        name = sc.nextLine();
        System.out.println("Enter Mobile number of the customer:");
        mobno = sc.nextLong();
        System.out.println("Enter cost of the items purchased:");
        cost = sc.nextDouble();
    }

    public void calculate() {
        if (cost <= 10000) {
            dis = cost * 5 / 100;
            amount = cost - dis;
        } else if (cost > 10000 && cost <= 20000) {
            dis = cost * 10 / 100;
            amount = cost - dis;
        } else if (cost > 20000 && cost <= 35000) {
            dis = cost * 15 / 100;
            amount = cost - dis;
        } else if (cost > 35000) {
            dis = cost * 20 / 100;
            amount = cost - dis;
        }
    }

    public void display() {
        System.out.println("\nName:" + name);
        System.out.println("Mobile No:" + mobno);
        System.out.println("Amount:" + amount);
    }

    public static void main(String args[]) {
        ShowRoom ob = new ShowRoom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}