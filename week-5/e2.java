
import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入从五边形中心到顶点的长度
        System.out.print("the length of the pentagon: ");
        double lengthToVertex = scanner.nextDouble();

        // 计算五边形的面积
        double area = (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lengthToVertex, 2);

        // 显示结果
        System.out.printf("the space of the pentagon: %.2f\n", area);

        scanner.close();

    }
}
