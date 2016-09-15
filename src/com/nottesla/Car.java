package com.nottesla;

/**
 * Created by tesla on 9/14/16.
 */
public class Car {
    private int doors;
    private boolean isHatchback;
    private String maker;
    private int year;

    public Car(int doors, boolean isHatchback, String maker, int year) {
        this.doors = doors;
        this.isHatchback = isHatchback;
        this.maker = maker;
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isHatchback() {
        return isHatchback;
    }

    public void setHatchback(boolean hatchback) {
        isHatchback = hatchback;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20d\n%-20s %-20s\n%-20s %-20s\n%-20s %-20d\n",
                "Number of doors: ", doors,
                "Is it hatchback? ", (isHatchback ? "yes" : "no"),
                "Is made by: ", maker,
                "Year: ", year);
    }
}
