package org.example;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //Write a Java Program to print
        // the first 10 numbers of Fibonacci series
        int[] fibonacciNums = new int[10];
        fibonacciNums[0] = 0;
        fibonacciNums[1] = 1;

        for (int i = 2; i < fibonacciNums.length; i++) {
            fibonacciNums[i] = fibonacciNums[i - 1] + fibonacciNums[i - 2];
        }

        System.out.println(Arrays.toString(fibonacciNums));
    }
}
