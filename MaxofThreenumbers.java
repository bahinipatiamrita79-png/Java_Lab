class MaxNumber {
    int a, b, c;
    MaxNumber(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }
    void findMax() {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("Maximum number is: " + max);
    }

    public static void main(String[] args) {
        MaxNumber obj = new MaxNumber(10, 25, 15);  
        obj.findMax();
    }
}
