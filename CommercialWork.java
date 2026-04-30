interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double lastSale;
    String lastClient;

    public void processSale(double amount) {
        lastSale = amount;
        System.out.println("Sale processed: ₹" + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("Invoice generated for " + clientName + " of ₹" + amount);
    }

    void showSummary() {
        System.out.println("Summary: Sale ₹" + lastSale + " for client " + lastClient);
    }
}

public class Main {
    public static void main(String[] args) {
        CommercialExecutive ce = new CommercialExecutive();

        ce.processSale(5000);
        ce.generateInvoice("ABC Pvt Ltd", 5000);
        ce.showSummary();
    }
}
