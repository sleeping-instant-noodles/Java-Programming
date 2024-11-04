package demo1.week9;

public class task2 {
    public static void main(String[] args) {
        Circle Circle = new Circle();
        System.out.println("The area of the circle of radius "+Circle.radius+" is "+Circle.getArea());
        Circle Circle2 = new Circle(25);
        System.out.println("The area of the circle of radius "+Circle2.radius+" is "+Circle2.getArea());
        Circle Circle3 = new Circle(75);
        System.out.println("The area of the circle of radius "+Circle3.radius+" is "+Circle3.getArea());
        Circle.radius=100;
        Circle2.setRadius(100);
        System.out.println("The area of the circle of radius "+Circle2.radius+" is "+Circle2.getArea());
    }
    double radius;
    task2 (){
        radius=1;
    }
    task2(double newRadius) {
        radius = newRadius;
    }

    // 计算面积的方法
    double getArea() {
        return Math.PI * radius * radius;
    }

    // 可选：设置半径的方法（如果需要的话）
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
