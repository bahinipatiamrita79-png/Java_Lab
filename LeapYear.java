class LeapYear {
    int year;

    LeapYear(int y) {
        year = y;
    }

    void checkLeap() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear(2024);  
        obj.checkLeap();
    }
}
