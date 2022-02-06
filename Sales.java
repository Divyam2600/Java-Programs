class Sales extends Product {
    int day;
    double tax;
    double totamt;
    Sales(String n, int c, double p, int d) {
        super(n, c, p);
        day = d;
    }
    void compute() {
        //No fine is charged if the payment is done within 30 days
        if (day <= 30) {
            tax = 12.4 * amount / 100;
            totamt = amount + tax;
        }
        double fine = 0.0;
        //Fine of 2.5% is charged if the payment is not done within 30 days
        if (day > 30) {
            tax = 12.4 * amount / 100;
            fine = 2.5 * amount / 100;
            totamt = amount + tax + fine;
        }
    }
    //To call the show function of the base class and display the details of the product along with the total amount to pay
    void show() {
        super.show();
        System.out.println("Total amount to be paid: " + totamt);
    }
} //Sales