package org.example;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array

        int[] nums = {5, 10, 34, 4, 56, 9};
        int max = 0;
        int min = nums[0];

        for (int n : nums) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }

        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}

