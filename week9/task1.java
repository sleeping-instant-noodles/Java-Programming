package demo1.week9;


public class task1 {
    public static void main(String[] args) {
        // 创建一个半径为默认的圆
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // 创建一个半径为25的圆
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // 创建一个半径为125的圆
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // 修改circle2的半径为100
        circle2.radius = 100; // 或者使用 circle2.setRadius(100) 如果提供了setRadius方法
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}

class Circle {
    public double radius; // 半径

    // 构造函数，初始化半径
    public Circle() {
        radius = 1; // 默认半径为1
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    // 计算面积的方法
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 可选：设置半径的方法（如果需要的话）
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}