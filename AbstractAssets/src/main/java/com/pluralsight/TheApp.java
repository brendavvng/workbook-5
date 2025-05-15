package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class TheApp {

    // creating main method
    public static void main(String[] args) {

        // initializing scanner for user input
        Scanner theScanner = new Scanner(System.in);
        // printing out welcome message
        System.out.print("\n");
        System.out.println("*・゜゜・*:.。..。.:*・*:゜・*:.。. .。.:*・゜゜・**・゜゜・*:.");
        System.out.println("     Hello! Welcome to the Assets Managing App!");
        System.out.println("*・゜゜・*:.。..。.:*・*:゜・*:.。. .。.:*・゜゜・**・゜゜・*:.\n");
        System.out.println(" ‧˚₊•┈┈┈┈List of Assets┈┈┈┈•‧₊˚⊹");

        // creating array list for assets
        ArrayList<Asset> assets = new ArrayList<>();

        // creating house objects
        House houseOne = new House(250000.00, "2025-01-05", "Cat Home",
                "123 Paw Street", 2000, 2, 4000);

        House houseTwo = new House(350000.00, "2025-10-05", "Beach Home",
                "444 Cherry Street", 4000, 1, 6500);

        // creating vehicle objects

        Vehicle vehicleOne = new Vehicle(30000, "2021-05-02", "My Beater Car",
                "Toyota Corolla", 45000, 2021);

        Vehicle vehicleTwo = new Vehicle(45000.00, "2024-01-04", "My Luxury Car",
                "Lexus IS 350 F Sport", 5800, 2024);

        Cash cashMoneyOne = new Cash(1000.00, "2025-04-02", "Some Savings");
        Cash cashMoneyTwo = new Cash(4000.00, "2025-05-05", "Cash for Matcha");

        // adding vehicles and home to assets list
        assets.add(houseOne);
        assets.add(houseTwo);
        assets.add(vehicleOne);
        assets.add(vehicleTwo);
        assets.add(cashMoneyOne);
        assets.add(cashMoneyTwo);

        // for loop for asset collection
        for(Asset asset : assets) {
            System.out.println("╭───────── · · ୨୧ · · ─────────╮");
            System.out.println("✿ Description:     " + asset.getDescription());
            System.out.println("✿ Date acquired:   " + asset.getDateAcquired());
            System.out.printf("✿ Cost:            $%.2f     \n", asset.getOriginalCost());
            System.out.printf("✿ Value:           $%.2f\n", asset.getValue());

            // checking if it is a house or vehicle
            if (asset instanceof House house){
                // printing the address of house
                System.out.println("✿ Address:         " + house.getAddress());
            } else if (asset instanceof Vehicle vehicle){
                // printing the year and make and model
                System.out.println("✿ Year:            " + vehicle.getYear()
                        + "\n✿ Make & Model:    " + vehicle.getMakeModel());
            }

            System.out.println("╰───────── · · ୨୧ · · ─────────╯");
            System.out.println("˚₊ ˚ ‧₊ .:･˚₊ ˚ ‧₊ .:･˚₊ *˚˚₊ ˚˚ ‧₊");
        }

        System.out.println("\n-`♡´- End of Assets. Goodbye! -`♡´-");
    }
}
