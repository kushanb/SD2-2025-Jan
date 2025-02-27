package com.iit.sd2.week6;

public class MethodOverloadingExample {

    public static void overloadedMethod(String a, String b) {
        System.out.println("Overloaded method 1");
    }

    public static void overloadedMethod(String b, String c, int d) {
        System.out.println("Overloaded method 2");
    }

    public static int overloadedMethod(String a, String b, String c) {
        System.out.println("Overloaded method 3");

        return 3;
    }

    public static void main(String[] args) {
        overloadedMethod("A", "B", "6");
        overloadedMethod("A", "B", 6);

    }
}
