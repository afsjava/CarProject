package com.nottesla;

public class CarDriver {

    public static void main(String[] args) {
        int doors = 4;
        int year = 1998;
        String maker = "Hoss";
        boolean isHatchback = false;
        Car car = new Car(doors, isHatchback, maker, year);
        System.out.println(car);
    }
}
