import java.util.Scanner;

public class StringFromConsle {
    public static void main(String[] args) { // 修正了原代码中的括号错误
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next(); // 第一个单词
        String s2 = input.next(); // 第二个单词
        String s3 = input.next(); // 第三个单词

        // 打印每个单词
        System.out.println("s1 is: " + s1); // 修正了原代码中的打印语句，添加了冒号和空格以提高可读性
        System.out.println("s2 is: " + s2);
        System.out.println("s3 is: " + s3);

        // 注意：原代码中的变量声明部分存在语法错误（如String后面的逗号），已在补全代码中修正

        input.close(); // 关闭Scanner对象以释放资源

    }
}
