package org.example;

public class Task6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not
        boolean isPrime = true;

        int num = 9;
        if (num <= 1) {
            System.out.println("The number is not prime or composite.");
        } else {

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime);
        }
    }
}
