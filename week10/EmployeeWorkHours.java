import java.util.Arrays;

public class EmployeeWorkHours {
    public static void main(String[] args) {
        // 示例数据，8名员工，每人7天的工作时长
        int[][] workHours = {
                {40, 40, 40, 40, 40, 0, 0},
                {30, 30, 30, 30, 30, 30, 0},
                {20, 20, 20, 20, 20, 20, 20},
                {35, 35, 35, 35, 35, 35, 0},
                {40, 40, 40, 40, 40, 40, 0},
                {32, 32, 32, 32, 32, 32, 0},
                {28, 28, 28, 28, 28, 28, 0},
                {38, 38, 38, 38, 38, 38, 0}
        };

        // 计算每个员工的总工作时长
        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[0].length; j++) {
                totalHours[i] += workHours[i][j];
            }
        }

        // 将员工编号和总工作时长组合成新的数组
        int[][] employeeAndHours = new int[workHours.length][2];
        for (int i = 0; i < workHours.length; i++) {
            employeeAndHours[i][0] = i;
            employeeAndHours[i][1] = totalHours[i];
        }

        // 根据总工作时长对员工进行排序
        Arrays.sort(employeeAndHours, (a, b) -> b[1] - a[1]);

        // 输出结果，增强型for循环
        for (int[] employee : employeeAndHours) {
            System.out.println("Employee " + (employee[0] + 1) + " total hours: " + employee[1]);
        }
    }
}