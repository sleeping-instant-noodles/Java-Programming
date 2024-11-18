import java.util.Random;

public class MatrixOneCounter {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // 随机填充0和1到矩阵
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // 打印矩阵
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 计算每行的1的数量
        int[] rowOnes = new int[4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    rowOnes[i]++;
                }
            }
        }

        // 计算每列的1的数量
        int[] colOnes = new int[4];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    colOnes[j]++;
                }
            }
        }

        // 找到含有最多1的行
        int maxRowOnes = 0;
        System.out.print("The largest row indices: ");
        for (int i = 0; i < rowOnes.length; i++) {
            if (rowOnes[i] >= maxRowOnes) {
                if (rowOnes[i] > maxRowOnes) {
                    System.out.print("");
                    maxRowOnes = rowOnes[i];
                }
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 找到含有最多1的列
        int maxColOnes = 0;
        System.out.print("The largest column indices: ");
        for (int j = 0; j < colOnes.length; j++) {
            if (colOnes[j] >= maxColOnes) {
                if (colOnes[j] > maxColOnes) {
                    System.out.print("");
                    maxColOnes = colOnes[j];
                }
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}