class SwapNumbers {
    int num;
    SwapNumbers(int n) {
        num = n;
    }
    void swap(SwapNumbers obj) {
        int temp = this.num;
        this.num = obj.num;
        obj.num = temp;
    }

    void display() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(10);
        SwapNumbers obj2 = new SwapNumbers(20);

        System.out.println("Before Swapping:");
        System.out.print("First Number: ");
        obj1.display();
        System.out.print("Second Number: ");
        obj2.display();
        obj1.swap(obj2);

        System.out.println("After Swapping:");
        System.out.print("First Number: ");
        obj1.display();
        System.out.print("Second Number: ");
        obj2.display();
    }
}
