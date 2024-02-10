package org.example;

import java.util.logging.Logger;

public class RecursiveImplement {
    private static final Logger log = Logger.getLogger(RecursiveImplement.class.getName());

    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        try {
            int result = recursiveFibonacci(n);
            log.info(() -> String.format("The %d-th Fibonacci number is: %d", n, result));
        } catch (IllegalArgumentException e) {
            log.warning("Error: " + e.getMessage());
        }
    }
}
