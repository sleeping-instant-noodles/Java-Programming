package demo1.week11;

public class task4 {

    private double radius = 1;

    /**
     * The number of the objects created
     */
    private static int numberofobjects = 0;

    /**
     * Construct a circle with radius 1
     */
    public task4() {
        numberofobjects++;
    }

    /**
     * Construct a circle with a specified radius
     */
    public task4(double newRadius) {
        radius = newRadius;
        numberofobjects++;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberofobjects;
    }

    /**
     * Return the area of this circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
class TestCircleWithPrivateDataFields {
    /**
     * Main method
     */
    public static void main(String[] args) {
// Create a Circle with radius 5.0
        task4 myCircle = new task4(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is" + myCircle.getArea());
// Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        System.out.println("The number of objects created is " + task4.getNumberOfObjects());
    }
}