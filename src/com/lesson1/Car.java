package com.lesson1;

public class Car extends Auto {
    private double currentSpeed;
    private String colorOfCar;
    private int countOfPassengers;

    public Car(String model, int power, String colorOfCar) {
        super(model, power);
        this.colorOfCar = colorOfCar;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }
}
