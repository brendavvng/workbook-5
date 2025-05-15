package com.pluralsight;

// creating abstract class by adding "abstract"
public abstract class Asset {

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


    // changing this to abstract - removing body and curly braces
    public abstract double getValue();
}
