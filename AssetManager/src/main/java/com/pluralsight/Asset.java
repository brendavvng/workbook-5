package com.pluralsight;

public class Asset {

    // properties of asset
    protected String dateAcquired;
    protected double originalCost;
    protected String description;

    // creating constructors, sets values for properties
    public Asset(double originalCost, String dateAcquired, String description) {
        this.originalCost = originalCost;
        this.dateAcquired = dateAcquired;
        this.description = description;
    }

    // creating getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }


    // creating getValue getter
    public double getValue() {
        return originalCost;

    }
}
