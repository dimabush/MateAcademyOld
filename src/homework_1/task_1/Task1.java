package homework_1.task_1;

public class Task1 {

    private static int matchResult(int a, int b, int c, int d){
        return (a == c && b == d) ? 2 : ((a < b && c < d) || (a > b && c > d)) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(matchResult(1, 2, 1, 2));
        System.out.println(matchResult(1, 2, 0, 8));
        System.out.println(matchResult(1, 2, 2, 2));
    }
}
