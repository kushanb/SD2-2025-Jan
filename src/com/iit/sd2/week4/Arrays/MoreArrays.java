package com.iit.sd2.week4.Arrays;

import java.util.Arrays;

public class MoreArrays {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.println("Before Change (numbers): " + Arrays.toString(numbers));

        int[] values = numbers.clone();

        System.out.println("Before Change (values): " + Arrays.toString(values));

        values[1] = 25;

        System.out.println("After Change (values): " + Arrays.toString(values));
        System.out.println("After Change (numbers): " + Arrays.toString(numbers));

        // 2 dimensional arrays

        // Creating a 2D array with arrays of the same length inside
        int[][] moreNumbers = new int[3][4];
        System.out.println(Arrays.toString(moreNumbers));
        for(int[] nums: moreNumbers) {
            System.out.println(Arrays.toString(nums));
        }

        // Creating a 2D array with the values already initialized and with unequal lengths
        int[][] moreNumbersWithValues = {{1, 2, 3}, {10, 20, 30, 40}};
        for(int[] nums: moreNumbersWithValues) {
            System.out.println(Arrays.toString(nums));
        }

        // Creating a 2D array without the values but with unequal lengths
        int[][] moreNumsWithoutValues = new int[3][];
        moreNumsWithoutValues[0] = new int[5];
        moreNumsWithoutValues[1] = new int[2];
        moreNumsWithoutValues[2] = new int[7];

        for(int[] nums: moreNumsWithoutValues) {
            System.out.println(Arrays.toString(nums));
        }

        // 3D Array
        System.out.println("Printing the 3D array");
        int[][][] threeDimensionArray = new int[3][4][2];
        for(int[][] vals: threeDimensionArray) {
            System.out.println(Arrays.toString(vals));
            for(int[] vals2: vals) {
                System.out.println(Arrays.toString(vals2));
            }
        }

        System.out.println("2D array Length: "
                + threeDimensionArray[0][1].length);

    }
}
