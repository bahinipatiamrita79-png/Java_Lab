class GradingSystem {
    double percentage;

    GradingSystem(double p) {
        percentage = p;
    }

    void calculateGrade() {
        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }

    public static void main(String[] args) {
        GradingSystem obj = new GradingSystem(85); e
        obj.calculateGrade();
    }
}
