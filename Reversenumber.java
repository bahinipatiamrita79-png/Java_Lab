class ReverseNumber {
    int number;

    ReverseNumber(int n) {
        number = n;
    }

    void reverse() {
        int rev = 0, temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed Number: " + rev);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber(1234); 
        obj.reverse();
    }
}
