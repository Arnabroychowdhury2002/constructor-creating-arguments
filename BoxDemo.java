class Box {
    double length;
    double breadth;
    double height;
    double vol;

    // Constructor with no arguments
    Box() {
        length = 0.0;
        breadth = 0.0;
        height = 0.0;
    }

    // Constructor with one argument
    Box(double side) {
        length = side;
        breadth = side;
        height = side;
    }

    // Constructor with three arguments
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Member function to calculate the volume
    void volume() {
        vol = length * breadth * height;
    }

    // Member function to display the volume
    void display() {
        System.out.println("Volume of the box: " + vol);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        // Creating objects of the Box class with different constructors
        Box box1 = new Box();                   // Constructor with no arguments
        Box box2 = new Box(5.0);                // Constructor with one argument
        Box box3 = new Box(3.0, 4.0, 6.0);      // Constructor with three arguments

        // Using object to invoke the volume method
        box1.volume();
        box2.volume();
        box3.volume();

        // Using object to invoke the display method
        box1.display();
        box2.display();
        box3.display();
    }
}
