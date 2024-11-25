package demo1.week11;

public class task6 {
    /* Main method */
    public static void main(String[] args) {
//Declare a circle array
        task4[] circleArray;
//Create Circle Array
        circleArray = createCircleArray();
//Print circleArnay
        printCircleArray(circleArray);
    }
    //Method to create an array of circle objects
    public static task4[] createCircleArray() {
        task4[] circleArray = new task4[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new task4(Math.random() * 10);
        }
        return circleArray;
    }
    public static void printCircleArray(task4[] circleArray) {
        System.out.printf("*%-305%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
    }
}