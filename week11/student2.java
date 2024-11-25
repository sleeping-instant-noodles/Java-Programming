package demo1.week11;

public class student2 {
    private String name;

    public student2(String name) {
        this.name = name;

    }

    public student2() {
        this("Irfan");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
class test{
    public static void main(String[] args) {
    student2 st1 = new student2();
    student2 st2 = new student2();
    System.out.println("The name of student" + st1.getName());
    System.out.println("The name of student" + st2.getName());
    }

}


