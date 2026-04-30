class Fibonacci {
    int n;

    Fibonacci(int num) {
        n = num;
    }

    void printSeries() {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci(10); 
        obj.printSeries();
    }
}
