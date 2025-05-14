package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset {


    // creating constructor matching super / parent class
    public Vehicle(double originalCost, String dateAcquired, String description) {
        super(originalCost, dateAcquired, description);
    }

    // creating properties of Vehicle
    // make & model of car
    String makeModel;
    // year of car
    int year;
    // miles of car
    int odometer;

    // creating vehicle constructors
    public Vehicle(double originalCost, String dateAcquired, String description,
                   String makeModel, int odometer, int year) {
        // "super" is calling the constructor in the Asset (parent) class
        super(originalCost, dateAcquired, description);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }

    // creating getters and setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    // creating override for getValue method, new version specific to a Vehicle
    @Override
    public double getValue() {
        // getting the current year
        int currentYear = Year.now().getValue();
        // calculating how old the car is
        int age = currentYear - year;
        double value;
        // determining the value of vehicle based on vehicle age
        if (age <= 3) {
            // 3% reduction per year for ages 0-3 years old
            value = originalCost * Math.pow(0.97, age);
        } else if (age <= 6) {
            // 6% reduction per year for ages 4-6 years old
            value = originalCost * Math.pow(0.94, age);
        } else if (age <= 10) {
            // 8% reduction per year for ages 7-10 years old
            value = originalCost * Math.pow(0.92, age);
        } else {
            // or else if the value is over 10 years old
            value = 1000.00;
        }
        // MINUS reduce final value by 25% if over 100,000 miles
        // unless makeModel contains word Honda or Toyota

        // if the miles are over 100,000 miles and ensures the vehicle is not a Honda or Toyota
        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") ||  makeModel.toLowerCase().contains("toyota"))){
            // reduces value by 25% if not Honda or Toyota
            value *= 0.75;
        }

    return value;

    }
}
