abstract class Asset {
    String descriptor;
    String date;
    double currentValue;
    Asset(String descriptor, String date, double currentValue) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
    }
    abstract void displayDetails();
}
class Stock extends Asset {
    int numShares;
    double sharePrice;
    Stock(String descriptor, String date, double currentValue,
          int numShares, double sharePrice) {
        super(descriptor, date, currentValue);
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }
    @Override
    void displayDetails() {
        System.out.println("=== Stock Details ===");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Number of Shares: " + numShares);
        System.out.println("Share Price: " + sharePrice);
    }
}
class Bond extends Asset {
    double interestRate;
    Bond(String descriptor, String date, double currentValue,
         double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }
    @Override
    void displayDetails() {
        System.out.println("=== Bond Details ===");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}
class Savings extends Asset {
    double interestRate;
    Savings(String descriptor, String date, double currentValue,
            double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }
    @Override
    void displayDetails() {
        System.out.println("=== Savings Details ===");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}
public class Main {
    public static void main(String[] args) {
        Asset stock = new Stock("Tech Stock", "2026-04-30", 50000, 100, 500);
        Asset bond = new Bond("Government Bond", "2026-04-30", 20000, 5.5);
        Asset savings = new Savings("Savings Account", "2026-04-30", 15000, 3.5);
        stock.displayDetails();
        System.out.println();
        bond.displayDetails();
        System.out.println();
        savings.displayDetails();
    }
}
