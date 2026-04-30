class NumberCheck {
    int num;

   NumberCheck(int n) {
        num = n;
    }
    void checkNumber() {
        if (num > 0)
            System.out.println(num + " is Positive");
        else if (num < 0)
            System.out.println(num + " is Negative");
        else
            System.out.println("Number is Zero");
    }

    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck(-5);  
        obj.checkNumber();
    }
}
