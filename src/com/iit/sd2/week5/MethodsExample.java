package com.iit.sd2.week5;

public class MethodsExample {

    private static void addNumbers(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total = " + total);
    }

    /**
     * Subtracts 2 numbers
     *
     * @param num1 first number
     * @param num2 second number
     * @return the subtracted value
     */
    private static int subNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static String example(int num) {
        System.out.println("Running line 1");
        if(num == 5) {
            return "Five";
        } else if(num == 10) {
            return "Ten";
        }

        System.out.println("Printing outside the condition");
        return "None";
    }

    public static void main(String[] args) {

        System.out.println(example(20));

//        int num1 = 5;
//        int num2 = 10;
//        int sub1 = subNumbers(num2, num1);

        addNumbers(3, 5);
        addNumbers(5, 7);
        addNumbers(2, 7);

        int firstCall = subNumbers(3, 5);
        int secondCall = subNumbers(5, 7);
        int thirdCall = subNumbers(2, 7);

        System.out.println(firstCall);
        System.out.println(secondCall);
        System.out.println(thirdCall);

        addNumbers(subNumbers(5, 3), subNumbers(6, 3));
        // first subNumbers(5, 3) is resolved
        // Then subNumbers(6, 3) is resolved
        // Finally addNumbers(subNumbers(5, 3), subNumbers(6, 3)) gets resolved
        // In the last step addNumbers(subNumbers(5, 3), subNumbers(6, 3)) is essentially addNumbers(2, 3)

        int x = 5;
        int y = 7;
        addNumbers(x, y);

//        int num1 = 5;
//        int num2 = 10;
//        int sub1 = subNumbers(num2, num1);
    }
}
