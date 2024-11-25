package demo1.week11;

class c {
    public int x = 1;
    int y = 2;
//    private int z = 3;

    public void m1() {
        System.out.println("I am method 1");
    }

    void m2() {
        System.out.println("I am method 2");
    }

    private void m3() {
        System.out.println("I am method 3");
    }
}

 public class task1 {

     public static void main(String[] args) {
         c task1 = new c();
         System.out.println(task1.x); // Can access
         System.out.println(task1.y); // Can access
         //
//         System.out.println(task1.z); // Cannot access 7
         task1.m1(); // Can inoke this method
         task1.m2();// Can invoke this method

         //task1.m3(); // cannot invoke this method
     }
 }
