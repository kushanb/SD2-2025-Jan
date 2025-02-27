package com.iit.sd2.week6;

public class Recursion {
    public static int getFactorial(int n) {
        if(n == 1) {
            return n;
        }
        int value = n * getFactorial(n-1);
        return value;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(10));
    }
}
