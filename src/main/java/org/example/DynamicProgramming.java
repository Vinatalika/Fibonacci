package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class DynamicProgramming {
    private static final Logger logger = Logger.getLogger(DynamicProgramming.class.getName());
    private static final Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }

    public static void main(String[] args) {
        int n = 6;

        try {
            long result = fibonacci(n);
            logger.info(() -> String.format("The %d-th Fibonacci number is: %d", n, result));
        } catch (IllegalArgumentException e) {
            logger.warning("Error: " + e.getMessage());
        }
    }
}
