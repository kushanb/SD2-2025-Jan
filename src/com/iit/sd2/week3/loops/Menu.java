package com.iit.sd2.week3.loops;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        boolean quit = false;
        System.out.println("* MENU *");
        System.out.println("1.- Print user name");
        System.out.println("2.- Add user");
        System.out.println("3.- Delete user");
        System.out.println("4.- Quit");

        while(!quit) {
            option = input.nextInt();
            switch(option) {
                case 1:
                    System.out.println("John Doe");
                    break;
                case 2:
                    System.out.println("Adding user");
                    break;
                case 3:
                    System.out.println("Deleted user");
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for running the code...");
                    break;
                default:
                    System.out.println("Invalid input...");
            }
        }
    }
}
