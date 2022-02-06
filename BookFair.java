/*Define a class named BookFair with the following description: [15]
Instance variables/Data members :-
String Bname — stores the name of the book
double price — stores the price of the book 

Member methods :-
(i) BookFair() — Default constructor to initialize data members
(ii) void Input() — To input and store the name and the price of the book.
(iii) void calculate() — To calculate the price after discount. 
Discount is calculated based on the following criteria.
    Price	                                              Discount
Less than or equal to Rs. 1000	                             2% of price
More than Rs. 1000 and less than or equal to Rs. 3000	     10% of price
More than % 3000	                                     15% of price

(iv) void display() — To display the name and price of the book after discount. 
Write a main method to create an object of the class and call the above member methods.
*/

import java.util.*;
public class BookFair {
    String Bname;
    double price;

    BookFair() {
        Bname = "";
        price = 0.0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        Bname = sc.nextLine();
        System.out.println("Enter Price of the Book: ");
        price = sc.nextDouble();
    }

    public void calculate() {
        double d;
        if (price <= 1000)
            d = 2.0 / 100 * price;
        else if (price > 1000 && price <= 3000)
            d = 10.0 / 100 * price;
        else
            d = 15.0 / 100 * price;
        price = price - d;
    }

    public void display() {
        System.out.println("Book Name: " + Bname);
        System.out.println("Final Price: " + price);
    }

    public static void main(String args[]) {
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}