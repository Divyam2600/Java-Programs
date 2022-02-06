class Highest extends Record {
    int ind;
    public Highest(int cap) {
        super(cap);
        ind = cap;
    }
    //To Find the index no of Student who scored the highest
    public void find() {
        ind = 0;
        for (int i = 0; i < size; i++) {
            if (m[i] > m[ind]) {
                ind = i;
            }
        }
    }
    //To call the display function of the base class and display The Name & Marks of the Student who scored the highest
    public void display() {
        super.display();
        System.out.println("Student who score the highest marks is: ");
        for (int i = 0; i < size; i++) {
            if (m[i] == m[ind]) {
                System.out.println(n[i] + "-" + m[i]);
            }
        }
    }
} //Highest