/*

A superclass Product has been defined to store the details of a product sold by a wholesaler to a retailer. 
Define a subclass Sales to compute the total amount paid by the retailer with or without fine along with service tax.

Some of the members of both classes are given below:


Class name: Product

Data members/instance variables:
name: stores the name of the product
code: integer to store the product code
amount: stores the total sale amount of the product (in decimals)

Member functions/methods:
Product (String n, int c, double p): parameterized constructor to assign data members: name = n, code = c and amount = p
void show(): displays the details of the data members


Class name: Sales

Data members/instance variables:
day: stores number of days taken to pay the sale amount
tax: to store the sen ice tax (in decimals)
totamt: to store the total amount (in decimals)

Member functions/methods:
1) Sales(….): parameterized constructor to assign values to data members of both the classes
2) void compute(): calculates the service tax @ 12.4% of the actual sale amount, 
   calculates the fine @ 2.5% of the actual sale amount only if the amount paid by the retailer to the wholesaler 
   exceeds 30 days calculates the total amount paid by the retailer as (actual sale amount + service tax + fine)
3) void show (): displays the data members of the superclass and the total amount

Assume that the superclass Product has been defined. Using the concept of inheritance, specify the class 
Sales giving the details of the constructor (…), void compute() ) and void show(). 
The main function and algorithm need NOT be written.

*/

class Product {
    String name;
    int code;
    double amount;
    Product(String n, int c, double p) {
        name = n;
        code = c;
        amount = p;
    }
    //To display The Name,Code and Amount of the Product
    void show() {
        System.out.println("Name is: " + name);
        System.out.println("Code is: " + code);
        System.out.println("Total Sale Amount: " + amount);
    }
} //Product