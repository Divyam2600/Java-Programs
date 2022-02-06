/*
Define a class named ParkingLot with the following description :
Instance variables/data members:-
int vno — To store the vehicle number
int hours — To store the number of hours the vehicle is parked in the parking lot
double bill — Tb store the bill amount

Member methods:-
void input( ) — To input and store the vno and hours.
void calculate( ) — To compute the parking charge at the rate of Rs.3 for the first hours or part thereof, and Rs. 1.50 for each additional hour or part thereof.
void display ( ) — To display the detail
Write a main method to create an object of the class and call the above methods.
*/

import java.util.*;

public class ParkingLot {
    int vno, hours;
    double bill;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehicle number: ");
        vno = sc.nextInt();
        System.out.println("Enter the number of hours for which the vehicle was parked");
        hours = sc.nextInt();
    }

    public void calculate() {
        if (hours <= 1)
            bill = hours * 3;
        else
            bill = 3 + (hours - 1) * 1.5;
    }

    public void display() {
        System.out.println("Vehicle Nuber: " + vno);
        System.out.println("Number of hours for which the vehicle was parked: " + hours);
        System.out.println("Bill to be paid: Rs" + bill);
    }

    public static void main(String[] args) {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}