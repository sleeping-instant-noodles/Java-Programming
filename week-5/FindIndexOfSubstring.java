public class FindIndexOfSubstring {
    public static void main (String[] args) {

        System.out.println("Welcome to Java".indexOf("W"));
        System.out.println("Welcome to Java".indexOf("o"));
        System.out.println("Welcome to Java".indexOf("o", 5));
        System.out.println("Welcome to Java".indexOf("come"));
        System.out.println("Welcome to Java".indexOf("Java", 5));
        System.out.println("Welcome to Java".indexOf("java", 5));

        System.out.println("Welcome to Java".lastIndexOf("W"));
        System.out.println("Welcome to Java".lastIndexOf("0"));
        System.out.println("Welcome to Java".lastIndexOf("0", 5));
        System.out.println("Welcome to Java".lastIndexOf("come"));
        System.out.println("Welcome to Java".lastIndexOf("Java", 5));
        System.out.println("Welcome to Java".lastIndexOf("java", 5));
    }
}
