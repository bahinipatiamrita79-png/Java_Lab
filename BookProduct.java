import java.util.*;

abstract class AbstractProduct {
    int id; String name; double price;
    AbstractProduct(int i,String n,double p){id=i;name=n;price=p;}
    abstract void display();
}

class Book extends AbstractProduct {
    Book(int i,String n,double p){super(i,n,p);}
    void display(){
        System.out.println("Book: "+id+" "+name+" "+price);
    }
}

class CD extends AbstractProduct {
    CD(int i,String n,double p){super(i,n,p);}
    void display(){
        System.out.println("CD: "+id+" "+name+" "+price);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AbstractProduct obj;

        obj=new Book(sc.nextInt(),sc.next(),sc.nextDouble());
        obj.display();

        obj=new CD(sc.nextInt(),sc.next(),sc.nextDouble());
        obj.display();
    }
}
