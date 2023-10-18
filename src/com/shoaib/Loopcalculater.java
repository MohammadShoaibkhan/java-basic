package com.shoaib;

public class Loopcalculater {
    public static void main(String[] args) {
        int sum = 0;

        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println("The sum of first 10 natural number " + sum);
    }
}