interface Mango {
    void show();
}

class Winter implements Mango {
    public void show() {
        System.out.println("Mango is not available in Winter");
    }
}

class Summer implements Mango {
    public void show() {
        System.out.println("Mango is available in Summer");
    }
}

public class Main {
    public static void main(String[] args) {
        Mango w = new Winter();
        Mango s = new Summer();

        w.show();
        s.show();
    }
}
