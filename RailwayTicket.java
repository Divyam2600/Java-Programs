/*
Design a class Railway Ticket with following description :
Instance variables/s data members :-
String name : To store the name of the customer
String coach : To store the type of coach customer wants to travel
long mobno : To store customer’s mobile number
int amt : To store basic amount of ticket
int totalamt : To store the amount to be paid after updating the original amount

Member methods:-
void accept () — To take input for name, coach, mobile number and amount
void update ()— To update the amount as per the coach selected
    Type of Coaches	     Amount
      First_ AC	              700
      Second_AC	              500
      Third _AC	              250
      Sleeper	              None
      
void display() — To display all details of a customer such as name, coach, total amount and mobile number.
Write a main method to create an object of the class and call the above member methods.
*/

import java.util.*;
class RailwayTicket {
    String name, coach;
    long mobno;
    int amt, totalamt;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passenger's Name: ");
        name = sc.nextLine();
        System.out.print("Enter Mobile Number:");
        mobno = sc.nextLong();
        System.out.print("Enter basic amount of ticket:");
        amt = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Coach (FirstAC / SecondAC / ThirdAC / Sleeper):");
        coach = sc.nextLine();
    }

    public void update() {
        if (coach.equals("FirstAC"))
            totalamt = amt + 700;
        else if (coach.equals("SecondAC"))
            totalamt = amt + 500;
        else if (coach.equals("ThirdAC"))
            totalamt = amt + 250;
        else if(coach.equals("Sleeper"))
            totalamt = amt;
        else{
            System.err.println("Invalid Coach Input");
            System.exit(0);
        }
    }

    public void display() {
        System.out.println("\nName :" + name);
        System.out.println("Coach :" + coach);
        System.out.println("Total Amount:" + totalamt);
        System.out.println("Mobile No.:" + mobno);
    }

    public static void main(String args[]) {
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}