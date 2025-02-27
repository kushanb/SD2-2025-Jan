package com.iit.sd2.week4.Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] intArray;
        String[] stringArray = {"String 1", "String 2", "String 3"};
        double[] doubleArray;

        intArray = new int[5];
        doubleArray = new double[2];

        System.out.println(Arrays.toString(stringArray));

        intArray[0] = 5;
        intArray[1] = 7;
        intArray[2] = 3;
        intArray[intArray.length - 1] = 9;

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));

        try {
            System.out.println(intArray[intArray.length - 1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not an index of the array");
        }

        System.out.println("Looping through the arrays");
        String[] stringArray2 = {"String 1", "String 2", "String 3"};

//        for(int index = 0; index < stringArray2.length; index++) {
//            System.out.println(stringArray2[index]);
//        }

//        for(String element: stringArray2) {
//            System.out.println(element + " Enhanced for loop");
//        }

        String[] stringArr3 = new String[4];
        System.out.println(Arrays.toString(stringArr3));
        System.out.println(stringArr3[0]);

        int numberToDelete = 1;
        stringArray2[numberToDelete] = null;

        int numberOfElements = stringArray2.length;
        numberOfElements--;
        for(int i = numberToDelete; i < numberOfElements; i++) {
            stringArray2[i] = stringArray2[i+1];
            stringArray2[i + 1] = null;

        }

        for(String element: stringArray2) {
            System.out.println(element);
        }


    }
}
