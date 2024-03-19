package org.example;

public class Task9 {
    public static void main(String[] args) {
        //Write a java program to find
        // the second largest number in the array

        int[] nums = {107, 99, 55, 34, 67, 78, 190, 41};


        int largestNum = 0;
        int secondLargestNum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = nums[i];
            } else if (nums[i] > secondLargestNum) {
                secondLargestNum = nums[i];
            }
        }


        System.out.println(largestNum);
        System.out.println(secondLargestNum);
    }
}
