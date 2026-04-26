package app;

import model.*;
import java.util.ArrayList;

public class SeedData {
   
    public static ArrayList<Item> loadSampleListings() {
        ArrayList<Item> listings = new ArrayList<>();
       
        // Textbooks
        listings.add(new TextBook("Java Programming", 350.00, "Theo", "CSI142"));
        listings.add(new TextBook("Data Structures", 280.00, "Tyra", "CSI132"));
        listings.add(new TextBook("Database Systems", 320.00, "Kemmonye", "CSI251"));
       
        // Electronics
        listings.add(new Electronics("Scientific Calculator", 150.00, "Ame", "Casio"));
        listings.add(new Electronics("USB Flash Drive 64GB", 45.00, "Theo", "SanDisk"));
        listings.add(new Electronics("Laptop Cooling Pad", 120.00, "Tyra", "CoolerMaster"));
       
        // Clothing
        listings.add(new Clothing("UB Hoodie", 85.00, "Kemmonye", "Large"));
        listings.add(new Clothing("Lab Coat", 60.00, "Ame", "Medium"));
        listings.add(new Clothing("Programming T-Shirt", 25.00, "Theo", "XL"));
       
        return listings;
    }
}