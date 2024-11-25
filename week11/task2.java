package demo1.week11;


//This is okay because object c is used inside the class C.
public class task2 {
    private boolean x;
    private int convert() {
        return x ? 1 : -1;
    }
    public static void main(String[] args) {
        task2 object1 = new task2();
        System.out.println(object1.x);
        System.out.println(object1.convert());
    }

}


//
////This is wrong because x and convert are private in class C.
//public class TestC {
//    public static void main(String[] args) {
//        C object1 = new C();
//        System.out.println(object1.x);
//        System.out.println(object1.convert());
//    }
//}


