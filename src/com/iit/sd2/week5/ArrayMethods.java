package com.iit.sd2.week5;

import java.util.Arrays;

public class ArrayMethods {
    private static int randomNumber = 5;

    private static void changeArray(int[] arr) {
//        int[] arr1 = arr.clone(); // If you want to make a copy of the original
//        arr[2] = 5;
//        arr[1] = 9;
        for(int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        System.out.println("In the method: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,4};
        System.out.println("Before accessing the method... : "
                + Arrays.toString(arr1));
        changeArray(arr1);
        System.out.println("Outside: " + Arrays.toString(arr1));
    }
}
