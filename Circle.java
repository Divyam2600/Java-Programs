class Circle extends Plane {
    int x2;
    int y2;
    double radius;
    double area;
    Circle(int nx, int ny, int nx2, int ny2) {
        super(nx, ny);
        x2 = nx2;
        y2 = ny2;
    }
    //To calculate the Radius of the Circle
    void findRadius() {
        radius = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) / 2.0;
    }
    //To calculate the Area of the Circle
    void findArea() {
        area = 3.14 * radius * radius;
    }
    //To call the display function of the base class and display The 2nd Endpoint Coordinates, Calculated Radius and Area
    void show() {
        super.show();
        System.out.println("2nd Endpoint Coordinates: ");
        System.out.println(" X COORDINATE: " + x2 + ",      Y COORDINATE: " + y2);
        System.out.println("Radius:" + radius);
        System.out.println("Area: " + area);
    }
} //Circle