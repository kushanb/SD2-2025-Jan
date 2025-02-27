package com.iit.sd2.week6;

public class ScopeExample {
    private static String same = "This is in the class scope"; // global

    public static void main(String[] args) {
//        int sum = 0;
//        for(int i = 0; i < 10; i++) {
//            int add = sum + i;
//            sum = add;
//        }
//        System.out.println(sum);
        String same = "This is in the main method";
        System.out.println(same);
    }
}
