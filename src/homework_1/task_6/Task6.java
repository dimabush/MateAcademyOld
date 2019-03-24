package homework_1.task_6;

public class Task6 {

    private static void findMaxMin(int matrix[][]) {
        int max = matrix[0][0];
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) max = matrix[i][j];
                else if (min > matrix[i][j]) min = matrix[i][j];
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("This is MAX value: %d %nThis is MIN value: %d", max, min);
    }

    public static void main(String[] args) {
        int matr[][] = {{2, 4, 6}, {7, 8, 12}, {-2, 3, 0}, {34, 9, 0}};
        findMaxMin(matr);
    }
}
