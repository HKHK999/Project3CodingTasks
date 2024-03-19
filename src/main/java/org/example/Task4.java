package org.example;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers.
        // Develop a program which will calculate the sum of even
        // and odd numbers for that array.

        int[][] nums = {
                {24, 36, 79, 5},
                {4, 56, 39, 8},
                {17, 16, 90, 82}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    sumEven += nums[i][j];
                } else {
                    sumOdd += nums[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers in the array is " + sumEven);
        System.out.println("The sum of odd numbers in the array is " + sumOdd);

    }
}
