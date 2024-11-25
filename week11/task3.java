package demo1.week11;

public class task3 {

    public int x = 5;
    int y = 10;

    void m1() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println("This is main method of class-1");

    }
}

class Class2 {
    public static void main(String[] args) {
        task3 cl = new task3();
        System.out.println(cl.x);
        System.out.println(cl.y);
    }
}
