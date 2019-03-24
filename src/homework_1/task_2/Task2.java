package homework_1.task_2;

public class Task2 {

    private static void drawRhomb(int n) {
        if (n % 2 == 0) n -= 1;
        int a = n / 2;
        int b = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= a && i + j <= b) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            if (i < n / 2)
                b += 2;
            else
                a += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawRhomb(21);
    }
}
