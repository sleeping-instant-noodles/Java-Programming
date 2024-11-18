import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取3x4矩阵
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = scanner.nextDouble();
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
        // 计算并显示每列的元素之和
        for (int col = 0; col < 4; col++) {
            double columnSum = sumColumn(matrix, col);
            System.out.println("Sum of the elements at column " + (col + 1) + " is " + columnSum);
        }

        scanner.close();
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
