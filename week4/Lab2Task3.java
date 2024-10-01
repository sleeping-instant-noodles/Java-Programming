package week4;

public class Lab2Task3 {
    public static void main(String[] args) {
        System.out.println("today is Tuesday");
        int today=2;
        int plus=100%7;
        today=today+plus;
        switch (today)
        {
            case 1:
                System.out.println("today is Monday");
                break;
            case 2:
                System.out.println("today is Tuesday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is Friday");
                break;
            case 6:
                System.out.println("today is Saturday");
                break;
            case 7:
                System.out.println("today is Sunday");
        }
    }
}
