package demo1.week11;

public class student {
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }
}
class Main{
    public static void main(String[] args) {
        student s1 = new student("Alice", 20);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        s1.setName("Bob");
        s1.setAge(25);
        s1.setAge(-5);

        System.out.println("Update Name: " + s1.getName());
        System.out.println("Update Age: " + s1.getAge());
    }
}
