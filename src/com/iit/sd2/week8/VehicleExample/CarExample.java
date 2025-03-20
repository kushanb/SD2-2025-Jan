package com.iit.sd2.week8.VehicleExample;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        car1.setModel("A");
        car1.setYear(2002);
        car1.setPrice(2000000);

        System.out.println(car1);


        Car car2 = new Car("BMW", "M3", 2004);
        System.out.println(car2);

        Car car3 = new Car("Toyota", "Prius"
                , 2020, 90000);
        System.out.println("Discount if we apply 23%: "
                + car3.getDiscount(23.0));

        System.out.println("Discounted price if we apply 23%: "
                + car3.getDiscountedPrice(23.0));

        Car car4 = new Car("BMW", "M5", 2015, 81000);
        System.out.println(car4.getDiscount(10));
        System.out.println(car4.getDiscountedPrice(10));

    }
}
