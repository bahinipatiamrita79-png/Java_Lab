class DivisibleByFive {
    int number;

    DivisibleByFive(int n) {
        number = n;
    }

    void checkDivisible() {
        if (number % 5 == 0)
            System.out.println(number + " is divisible by 5");
        else
            System.out.println(number + " is not divisible by 5");
    }

    public static void main(String[] args) {
        DivisibleByFive obj = new DivisibleByFive(25);
        obj.checkDivisible();
    }
}
