import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 15: ");
        if (scanner.hasNextInt()) {
            int decimal = scanner.nextInt();

            if (decimal >= 0 && decimal <= 15) {
                String hex = Integer.toHexString(decimal).toUpperCase();
                // Ensure the hex string is two characters long by prefixing with '0' if necessary

                System.out.println("The hexadecimal number is: " + hex);
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}