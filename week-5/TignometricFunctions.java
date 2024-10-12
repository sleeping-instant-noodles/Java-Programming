public class TignometricFunctions {
    public static void main(String[] args) {
        // 计算并打印sin(PI/2)的值
        System.out.println("The value of sin(PI/2): " + Math.sin(Math.PI / 2));

        // 计算并打印cos(PI/2)的值
        System.out.println("The value of cos(PI/2): " + Math.cos(Math.PI / 2));

        // 注意：这里原代码中的Math.tan(o)应该是Math.tan(Math.PI)，因为o不是已定义的变量
        // 计算并打印tan(PI)的值，但注意tan(PI)是未定义的（数学上无穷大），这里仅为演示
        // 实际运行时会产生NaN（Not a Number）结果
        System.out.println("The value of tan(PI): " + Math.tan(Math.PI));

        // 计算并打印asin(0.5)的值
        System.out.println("The value of asin(0.5): " + Math.asin(0.5));

        // 计算并打印acos(0.5)的值
        System.out.println("The value of acos(0.5): " + Math.acos(0.5));

        // 计算并打印atan(1)的值
        System.out.println("The value of atan(1): " + Math.atan(1));
    }
}
