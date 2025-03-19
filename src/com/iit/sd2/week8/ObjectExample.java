package com.iit.sd2.week8;

public class ObjectExample {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

//        rectangle1.setColour("Green");
        rectangle1.setHeight(5);
        rectangle1.setWidth(10);

        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(5, 15, "Blue");
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(7, 3);
        Rectangle rectangle4 = new Rectangle(71, 31);
        System.out.println(rectangle3);
        System.out.println(rectangle4);

        // Init in 2 steps
//        Rectangle r1;
//        String c1 = "Red";
//        if(c1 != null) {
//            r1 = new Rectangle(4, 5, c1);
//        } else {
//            r1 = new Rectangle(4, 5);
//        }

        Rectangle r2 = rectangle3;
        System.out.println("Colour is: " + r2.getColour());

    }
}
