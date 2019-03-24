package homework_1.task_3;

public class Task3 {
    private static int squareRoot(int a){
        return a*a;
    }

    private static int cubeRoot(int a){
        return a*a*a;
    }

    private static double powMethod(int x, int n){
        double result = 1;
        if (n > 0){
            for (int i = n; i > 0; i--)
                result *= x;
        }else if (n < 0){
            for (int i = n; i < 0; i++)
                result /= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(13));
        System.out.println(cubeRoot(3));
        System.out.println(powMethod(2,-2));
    }
}
