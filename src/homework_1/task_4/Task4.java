package homework_1.task_4;

public class Task4 {

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    private static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(factorial(5));
    }
}
