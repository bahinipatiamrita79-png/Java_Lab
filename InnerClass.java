class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();         
        Outer.Inner in = obj.new Inner(); 
        in.display();
    }
}
