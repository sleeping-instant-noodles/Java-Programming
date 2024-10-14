import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int findGCD(int a, int b) {
        while (b!= 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }//辗转相除法
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor of these two numbers is: " + gcd);
    }
}