class Factorial {
    int num = 5; 

    int findFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int result = obj.findFactorial();
        System.out.println("Factorial of " + obj.num + " = " + result);
    }
}
