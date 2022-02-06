/*
Define a class ElectricBill with the following specifications :
Instance variables /data member :-
String n – to store the name of the customer
int units – to store the number of units consumed
double bill – to store the amount to be paid

Member methods :-
void accept () – to accept the name of the customer and number of units consumed
void calculate () – to calculate the bill as per the following tariff :
    Number of units         Rate per unit
    First 100 units             Rs 2.00
    Next 200 units              Rs 3.00
    Above 300 units             Rs 5.00
    A surcharge of 2.5% charged if the number of units consumed is above 300 units.
    
void print () - To print the details in the given format:
    Name of the consumer:
    Number of units consumed:
    Bill Amount:
    
Write a main method to create an object of the class and call the above member methods.
*/

import java.util.*;
class ElectricBill {
    String n;
    int units;
    double bill;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the customer = ");
        n = sc.nextLine();
        System.out.print("Number of units consumed = ");
        units = sc.nextInt();
    }

    public void calculate() {
        if (units <= 100)
            bill = 2.00 * units;
        if (units <= 300)
            bill = 3.00 * units;
        if (units > 300)
            bill =5.00 * units +((units-300) * 2.5/100);
    }

    public void print() {
        System.out.println("Name of the customer:" + n);
        System.out.println("Number of units consumed:" + units);
        System.out.println("Bill amount:" + bill);
    }

    public static void main(String args[]) {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}