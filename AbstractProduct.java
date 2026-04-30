import java.util.*;

abstract class AbstractProduct {
    int product_id;
    String name, description;

    AbstractProduct(int id, String n, String d) {
        product_id = id;
        name = n;
        description = d;
    }

    abstract void display();
}

class Product extends AbstractProduct {
    double price;

    Product(int id, String n, String d, double p) {
        super(id, n, d);
        price = p;
    }

    void display() {
        System.out.println(product_id + " " + name + " " + description + " " + price);
    }
}

class Book extends Product {
    String isbn, author, title;

    Book(int id, String n, String d, double p, String i, String a, String t) {
        super(id, n, d, p);
        isbn = i; author = a; title = t;
    }

    void display() {
        super.display();
        System.out.println(isbn + " " + author + " " + title);
    }
}

class TravelGuide extends Book {
    String country;

    TravelGuide(int id, String n, String d, double p, String i, String a, String t, String c) {
        super(id, n, d, p, i, a, t);
        country = c;
    }

    void display() {
        super.display();
        System.out.println("Country: " + country);
    }
}

class CompactDisc extends Product {
    String artist, title;

    CompactDisc(int id, String n, String d, double p, String ar, String t) {
        super(id, n, d, p);
        artist = ar; title = t;
    }

    void display() {
        super.display();
        System.out.println(artist + " " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AbstractProduct p;

        System.out.println("Enter TravelGuide details:");
        p = new TravelGuide(
            sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
            sc.next(), sc.next(), sc.next(), sc.next()
        );
        p.display();

        System.out.println("\nEnter CD details:");
        p = new CompactDisc(
            sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
            sc.next(), sc.next()
        );
        p.display();
    }
}
