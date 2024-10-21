public class Task5 {
    public static void nPrintln(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        nPrintln("Welcome to Java", 5);
        nPrintln("Computer Science", 15);
    }
}
