import java.util.Scanner;

public class ArraysWithInputValues {
    public static void main(String[] args) {
        double[] mylist=new double[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter"+mylist.length+"Values");
        for(int i=0;i<mylist.length;i++){
            mylist[i]=input.nextDouble();
        }
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i]);
        }
        input.close();
    }
}
