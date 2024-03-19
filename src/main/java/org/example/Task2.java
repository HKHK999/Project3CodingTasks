package org.example;

public class Task2 {
    public static void main(String[] args) {
        //Create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.

        int[] nums = {5, 10, 24, 34, 67, 78, 90, 41};
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        System.out.println("The sum of all elements in the array is " + sum);


    }
}
