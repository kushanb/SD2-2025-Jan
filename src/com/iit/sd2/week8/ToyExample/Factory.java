package com.iit.sd2.week8.ToyExample;

public class Factory {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Teddy Bear", "TD0012",
                1200, 12000);
        Toy toy2 = new Toy("Tea Set", "TE0123",
                1000, 22000);
        Toy toy3 = new Toy("Racing Car", "RC0342",
                5000, 7000);

        System.out.println(toy1);
        System.out.println(toy2);
        System.out.println(toy3);

        toy1.sellItem(500);
        toy3.addToStock(100);
        toy2.setPrice(1200);

        System.out.println("After updating....");
        System.out.println(toy1);
        System.out.println(toy2);
        System.out.println(toy3);
        System.out.println("Using return item: " + toy1.returnItem());
    }
}
