package com.iit.sd2.week8;

/**
 * Blueprint for creating rectangle objects
 */
public class Rectangle {
    private int height;
    private int width;
    private String colour;

    /**
     * Default constructor for creating a rectangle object
     */
    public Rectangle() {
        super();
    }

    /**
     * Constructor to init with all 3 values
     * @param height height of the rectangle
     * @param width width of the rectangle
     * @param colour colour of the rectangle
     */
    public Rectangle(int height, int width, String colour) {
        super();
        this.height = height;
        this.width = width;
        this.colour = colour;
    }

    public Rectangle(int height, int width) {
        super();
        this.height = height;
        this.width = width;
        this.colour = "Black";
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String getColour() {
        return this.colour;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

//    private void setColour(String colour) {
//        this.colour = colour;
//    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", colour='" + colour + '\'' +
                '}';
    }
}
