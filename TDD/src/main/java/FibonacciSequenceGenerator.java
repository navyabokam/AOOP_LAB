package main.java;

public class FibonacciSequenceGenerator {

    // Method to generate the nth Fibonacci number
    public int generateNthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Method to generate a list of the first n Fibonacci numbers
    public int[] generateFibonacciList(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        int[] fibonacciList = new int[n];
        fibonacciList[0] = 1;
        if (n > 1) {
            fibonacciList[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciList[i] = fibonacciList[i - 1] + fibonacciList[i - 2];
            }
        }
        return fibonacciList;
    }
}
