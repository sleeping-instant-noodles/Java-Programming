public class TuitionIncrease {
    public static void main(String[] args) {
        double tuition = 10000;
        double targetTuition = 20000;
        int years = 0;
        while (tuition < targetTuition) {
            tuition += tuition * 0.07;
            years++;
        }
        System.out.println("The tuition will double in " + years + " years.");
    }
}