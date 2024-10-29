public class ArrayElementsSum {
    public static void main(String[] args) {
        double[] mylist=new double[5];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=Math.random()*10;
        }
        double total=0;
        for (int i = 1; i < mylist.length; i++) {
            System.out.printf("%.2f",mylist[i]);
            System.out.print(" ");
            total+=mylist[i];
        }
        System.out.println();
        System.out.printf("Sum of all elements is:");
        System.out.printf("%.2f",total);
    }
}
