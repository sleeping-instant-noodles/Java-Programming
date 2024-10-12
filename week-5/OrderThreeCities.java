import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String city1 = scanner.nextLine();

        System.out.println("Enter the second city:");
        String city2 = scanner.nextLine();

        System.out.println("Enter the third city:");
        String city3 = scanner.nextLine();

        if (city1.compareTo(city2) > 0) {
            String temp = city1;
            city1 = city2;
            city2 = temp;
        }

        if (city1.compareTo(city3) > 0) {
            String temp = city1;
            city1 = city3;
            city3 = temp;
        }

        if (city2.compareTo(city3) > 0) {
            String temp = city2;
            city2 = city3;
            city3 = temp;
        }

        System.out.println("The cities in ascending order are: " + city1 + ", " + city2 + ", " + city3);
    }
}