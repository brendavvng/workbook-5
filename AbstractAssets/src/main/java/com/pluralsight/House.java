package com.pluralsight;

public class House extends Asset {

    // properties of house
    protected String address;
    // condition of the house, 1 - excellent, 2 - good, 3 - fair, 4 - poor
    protected int condition;
    protected int squareFoot;
    protected int lotSize;

    // creating constructor, sets values for properties
    // taking in both Asset properties and House properties
    public House(double originalCost, String dateAcquired, String description,
                 String address, int lotSize, int condition, int squareFoot) {
        // "super" is calling the constructor in the Asset (parent) class
        super(originalCost, dateAcquired, description);
        this.address = address;
        this.lotSize = lotSize;
        this.condition = condition;
        this.squareFoot = squareFoot;
    }

    // creating getters and setters
    // allows safe access & modification of private variables
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    // creating override for getValue method - new version, specific to a House
    @Override
    public double getValue() {
        double valuePerSqFt;
        switch (condition) {
            // case 1 - excellent condition
            case 1:
                valuePerSqFt = 180.0;
                break;
            // case 2 - good condition
            case 2:
                valuePerSqFt = 130.0;
                break;
            // case 3 - fair condition
            case 3:
                valuePerSqFt = 90.0;
                break;
            // case 4 - poor condition
            case 4:
                valuePerSqFt = 80.0;
                break;
            default: // if the condition is not 1-4, outcome will be null/invalid
                valuePerSqFt = 0.0;

        }
        // house is determined by sqft and value per sq ft, plus the 25 cents per sq ft of lot size
        return (valuePerSqFt * squareFoot) + (0.25 * lotSize);

    }
}
