package com.iit.sd2.week3.loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
//         For Loop
//        int i;
//        for(i = 1; i <= 7000; i++) {
//            System.out.println(i + " ");
//        }

        // While Loop
//        int j = 0;
//        while (j <= 100) {
//            System.out.println("j: " + j);
//            j++;
//        }

        Scanner scanner = new Scanner(System.in);
//        String password = "Admin@1234";
//
//        System.out.println("Enter the password: ");
//        String typedPw = scanner.next();
//        while (!typedPw.equals(password)) {
//            // This checks if the password is correct and flips the boolean
//            // to give the opposite of the condition to the loop
//            System.out.println("Password invalid. Enter again: ");
//            typedPw = scanner.next();
//        }
//        System.out.println("Password was correct!");

        // We give opposite to the loop because we want to run it as
        // long as the input is wrong


        // Sum of 10 numbers
//        int count = 1;
//        int total = 0;
//        while (count <= 10) {
//            System.out.print("Enter a number: ");
//            int num = scanner.nextInt();
//            total += num;
//            count++;
//        }
//        System.out.println(total);

//        String password = "Admin@1234";
//
//        String typedPw;
//        do {
//            // This loop runs the code at least once
//            System.out.println("Enter the password: ");
//            typedPw= scanner.next();
//        } while(!typedPw.equals(password));
//
//        System.out.println("Password was correct!");

//        for(int k = 0; k <= 10; k++) {
//            if(k % 2 == 0) {
//                System.out.println(k);
//            }
////            System.out.println(k);
//        }

        // Start printing example
        for(int row = 1; row <= 5; row++) {
            for(int column = 1; column <= row; column++) {
                if(row % 2 == 0) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
