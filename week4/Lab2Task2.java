package week4;

import java.util.Scanner;

public class Lab2Task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int seconds = sc.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Minutes: " + minutes);
        System.out.println("Remaining Seconds: " + remainingSeconds);
    }
}
