package com.iit.sd2.week8.ToyExample;

public class Toy {
    private String name;
    private String code;
    private double price;
    private int stock;

    public Toy(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = 0;
    }

    public Toy(String name, String code, double price, int stock) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void addToStock(int numberOfItems) {
        this.stock += numberOfItems;
    }

    public  void sellItem(int quantity) {
        this.stock -= quantity;
    }

    public String returnItem() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
