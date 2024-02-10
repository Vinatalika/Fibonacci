package org.example;

import java.util.logging.Logger;

public class IterativeImplement {
    private static final Logger log = Logger.getLogger(IterativeImplement.class.getName());

    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }

    public static int resultFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be a non-negative integer.");
        }
        return iterativeFibonacci(n);
    }

    public static void main(String[] args) {
        int n = 6;
        try {
            int result = resultFibonacci(n);
            log.info(() -> String.format("The %d-th Fibonacci number is: %d", n, result));
        } catch (IllegalArgumentException e) {
            log.warning("Error: " + e.getMessage());
        }
    }
}

