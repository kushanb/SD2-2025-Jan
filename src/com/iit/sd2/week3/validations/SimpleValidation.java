package com.iit.sd2.week3.validations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        boolean correct = false;
////        while(!correct) {
////            System.out.println("Enter your age: ");
////            if(input.hasNextInt()) {
////                int age = input.nextInt();
////                correct = true;
////            } else {
////                System.out.println("Not a valid input");
////            }
////        }
//        if(input.hasNextInt()) {
//            int age = input.nextInt();
////            correct = true;
//            System.out.println("This is correct");
//        } else {
//            System.out.println("Not a valid input");
//        }
//        System.out.println("How many novels have you read?");
//        if(input.hasNextInt()) {
//            int novels = input.nextInt();
//
//            if(novels > 20) {
//                System.out.println("Wow");
//            } else if(novels > 0) {
//                System.out.println("Not bad");
//            } else if (novels < 0){
//                System.out.println("Invalid input!");
//            } else {
//                System.out.println("Buy one now");
//            }
//        } else {
//            System.out.println("Enter numbers only...");
//        }


        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            System.out.println("Division of the number: " + (6 / num));
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid input. Enter only numbers...");
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by 0");
        }
    }
}
