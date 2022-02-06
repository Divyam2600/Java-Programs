/*

A line on a plane can be represented by coordinates of the two-end points p1 and p2 as p1(x1, y1) and p2(x2, y2).
A superclass Plane is defined to represent a line and a subclass Circle to find the length of the radius and 
the area of the circle by using the required data members of the superclass.

Some of the members of both classes are given below:


Class name: Plane

Data members/instance variables:
x1: to store the x-coordinate of the first endpoint
y1: to store the y-coordinate of the first endpoint

Member functions/methods:
Plane (int nx, int ny): parameterized constructor to assign the data members x1 = nx and y1 = ny
void show(): to display the coordinates


Class name: Circle

Data members /instance variables:
x2: to store the x-coordinate of the second endpoint
y2: to store the y-coordinate of the second endpoint
radius: double variable to store the radius of the circle
area: double variable to store the area of the circle

Member functions/methods:
1) Circle(…): parameterized constructor to assign values to data members of both the classes
2) void findRadius(): to calculate the length of the radius using the formula: [√{(x2−x1)2+(y2−y1)2}]/2
   (Assuming that x1, x2, y1, y2 are the coordinates of the two ends of the diameter of a circle)
3) voidfindArea(): to find the area of a circle using the formula: πr2. The value of pie(π) is 22/7 or 3.14
4) void show(): to display both the coordinates along with the length of the radius and area of the circle

Specify the class Plane giving details of the constructor and void show() Using the concept of inheritance, 
specify the class Circle giving details of the constructor, void findRadius(), void find Area() and voidShow(). 
The main function and algorithm need not be written.

*/

class Plane {
    int x1;
    int y1;
    Plane(int nx, int ny) {
        x1 = nx;
        y1 = ny;
    }
    //To display The 1st Endpoint Coordinates
    void show() {
        System.out.println("1st Endpoint Coordinates: ");
        System.out.println(" X COORDINATE: " + x1 + ",      Y COORDINATE: " + y1);
    }
} //Plane