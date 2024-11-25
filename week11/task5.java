package demo1.week11;

public class task5 {
    /**
     * Main method
     */

    public static void main(String[] args) {
// Create a Circle object with radius 1
        task4 myCircle = new task4(1);

// Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle,n);
// See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }


    public static void printAreas(task4 c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
