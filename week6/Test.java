public class Test {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for(; i < 10; i++) {
            sum += i;
        }

        int j = 5;
        if(i < j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }

        while(j < 10) {
            j++;
        }
        System.out.println(j);
        do {
            j++;
        } while(j < 10);
        System.out.println(j);
    }
}