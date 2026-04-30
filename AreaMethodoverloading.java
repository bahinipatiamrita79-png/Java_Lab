public class Overloading {
    void area(double r){
        double result = 3.14 * r * r;
        System.out.println("Area of circle : "+result);
    }

    void area(int l, int b){
        int result = l*b;
        System.out.println("Area of rectangle : "+result);
    }

    void area(double b,double h){
        double result = 0.5 * b * h;
        System.out.println("Area of triangle : "+result);
    }


    public static void main(String[] args) {
        Overloading ar = new Overloading();
        ar.area(56);
        ar.area(8, 6);
        ar.area(9.1,5.2);
    }
}
