package org.example;

public class Task5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable

        int a = 10;
        int b = 55;

        a = b + a;
        b = a - b;
        a = a - b;

        System.out.println("A is " + a);
        System.out.println("B is " + b);


    }
}
