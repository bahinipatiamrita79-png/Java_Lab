class Shape {
    void area() {
        System.out.println("Area calculation");
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Circle c = new Circle(3);
        Square s = new Square(6);

        r.area();
        c.area();
        s.area();
    }
}
