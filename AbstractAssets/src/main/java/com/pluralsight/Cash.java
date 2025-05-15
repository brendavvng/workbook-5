package com.pluralsight;

public class Cash extends Asset{


    public Cash(double originalCost, String dateAcquired, String description) {
        super(originalCost, dateAcquired, description);
    }

    @Override
    public double getValue() {
        return originalCost;

    }
}
