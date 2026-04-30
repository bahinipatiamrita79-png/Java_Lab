import java.util.*;

abstract class ThreeDObject {
    abstract double volume();
    abstract double wholeSurfaceArea();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l; this.b = b; this.h = h;
    }

    double volume() {
        return l * b * h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + h*l);
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double volume() {
        return a * a * a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r; this.h = h;
    }

    double volume() {
        return Math.PI * r * r * h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r; this.h = h;
    }

    double volume() {
        return (Math.PI * r * r * h) / 3;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        System.out.println("1.Box 2.Cube 3.Cylinder 4.Cone");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;
            case 2:
                obj = new Cube(sc.nextDouble());
                break;
            case 3:
                obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
                break;
            case 4:
                obj = new Cone(sc.nextDouble(), sc.nextDouble());
                break;
            default:
                return;
        }

        System.out.println("Volume: " + obj.volume());
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
    }
}
