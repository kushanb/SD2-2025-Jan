package com.iit.sd2.week8.VehicleExample;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    /**
     * Default constructor
     */
    public Car() {
        super();
        this.brand = "Toyata";
    }

    /**
     * Constructor initializing all the values
     *
     * @param brand brand of the car
     * @param model model of the car
     * @param year year of manufacture
     * @param price price of the car
     */
    public Car(String brand, String model, int year, double price) {
        super();
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Constructor without the price
     * @param brand brand of the car
     * @param model model of the car
     * @param year year of manufacture
     */
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Calculate the discounted price for a car
     * @param discount percentage of the discount
     * @return the discounted price
     */
    public double getDiscountedPrice(double discount) {
        double discountedPrice = this.price * (100 - discount) / 100;
        return discountedPrice;
    }

    /**
     * Get the discount amount
     * @param percentage percentage of the discount
     * @return the discount
     */
    public double getDiscount(double percentage) {
        double discount = this.price * percentage / 100.0;
        return discount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
