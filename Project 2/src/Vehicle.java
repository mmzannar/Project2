import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Vehicle {

    private String make;
    private String model;
    private double odometer;
    private String color;

    private int kilometersToDrive;
    public Vehicle(String make, String model, String color, double odometer) {

    }

    public Vehicle() {

    }

    public Vehicle(String expectedMake, String expectedModel, String expectedColor) {
    }

    public Vehicle(String expectedMake, String expectedModel, String expectedColor, double maxKilowattsInBattery, double kilometersPerKilowattHour, double currentKilowattsInBattery) {
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;}
    public String getModel() {
        return model;}
    public void setOdometer(double odometer) {
        this.odometer = odometer;}
    public void setColor(String color) {
        this.color = color;}



    public Vehicle (String make, String model, double odometer, String color) {
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.color = color;}

    private void validateOdometer() {
        double odometer = 0;}


    public boolean drive(int kilometersToDrive) {
        return false;
    }

    public String getColor() {
        return color;
    }}


