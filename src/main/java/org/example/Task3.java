package org.example;

public class Task3 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int[][] nums = {
                {24, 36, 79, 5},
                {4, 56, 39, 8},
                {17, 16, 90, 82}
        };

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
    }
}
