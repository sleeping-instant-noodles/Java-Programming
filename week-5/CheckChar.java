public class CheckChar {
    public static void main(String[] args) {
        char ch = 'A';
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase character.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase character.");
        } else {
            System.out.println(ch + " is neither an uppercase nor a lowercase character.");
        }
    }
}