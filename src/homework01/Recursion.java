package homework01;

class Recursion {

    static int fibonacci(int number) {
        if (number == 1 || number == 2) return 1;
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    static int factorial(int number) {
        if (number == 0 || number == 1) return 1;
        return number * factorial(number - 1);
    }
}
