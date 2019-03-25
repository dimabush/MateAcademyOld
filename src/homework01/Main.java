package homework01;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        //Task 1
        System.out.println(BettingCalculator.matchResult(1, 2, 1, 2));
        System.out.println(BettingCalculator.matchResult(1, 2, 0, 8));
        System.out.println(BettingCalculator.matchResult(1, 2, 2, 2));

        //Task 2
        DrawingARhombus.drawRhomb(21);

        //Task 3
        System.out.println("13 ^ 2 = " + Exponentiation.square(13));
        System.out.println("3 ^ 3 = " + Exponentiation.cube(3));
        System.out.println("2 ^ -2 = " + Exponentiation.powMethod(2, -2));

        //Task 4
        System.out.println("F_10 = " + Recursion.fibonacci(10));
        System.out.println("5! = " + Recursion.factorial(5));


        //Task 6
        int[][] matrix = {{2, 4, 6}, {7, 8, 12}, {-2, 3, 0}, {34, 9, 0}};
        MatrixMethods.findMaxMin(matrix);

        //Task 7
        Department dept = new Department(1, "HR");
        Employee original = new Employee(3, "Admin", dept);

        Employee cloned = original.clone();

        cloned.getDepartment().setName("Finance");
        System.out.println(cloned.getDepartment().getName());
        System.out.println(original.getDepartment().getName());
    }
}
