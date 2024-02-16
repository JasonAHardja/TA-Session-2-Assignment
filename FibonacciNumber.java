public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10;
        int fibonacciNumber = calculateFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }

    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}