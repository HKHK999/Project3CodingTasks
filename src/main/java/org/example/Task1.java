package org.example;

public class Task1 {

    public static void main(String[] args) {

        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        double[] temp = {73.5, 172.3, 64.5, 57.0, 89.0, 42.9, 92.3};
        double highestTemp = 0.0;
        double lowestTemp = temp[0];


        for (double t : temp) {
            if (t > highestTemp) {
                highestTemp = t;
            } else if (t < lowestTemp) {
                lowestTemp = t;
            }
        }

        System.out.println("The highest temperature is " + highestTemp);
        System.out.println("The lowest temperature is " + lowestTemp);

    }
}

