public class FormatDemo {
    public static void main(String[] args) {
        // 修改表头格式，使表头更清晰易读
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        // Display values for 30 degree
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        // 修改输出格式，确保小数位数正确且对齐
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        // Display values for 60 degree
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}