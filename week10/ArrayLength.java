public class ArrayLength {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println("The length of the first dimension of the 2D array: " + array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println("The length of sub - array " + (i + 1) + ": " + array[i].length);
        }

        try {
            System.out.println(array[4].length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Out - of - bounds access: " + e.getMessage());
        }
    }
}