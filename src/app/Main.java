package app;

import model.*;
import service.*;
import java.util.*;

public class Main {
   
    private static ListingService listingService = new ListingService();
    private static ReportService reportService = new ReportService();
    private static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
       
        // Load seed data
        ArrayList<Item> seedListings = SeedData.loadSampleListings();
        for (Item item : seedListings) {
            listingService.addListing(item);
        }
       
        System.out.println("===== UB STUDENT EXCHANGE =====");
        System.out.println("Welcome! Loaded " + seedListings.size() + " sample listings.");
       
        int choice;
        do {
            displayMenu();
            choice = getIntInput("Enter choice: ");
           
            switch (choice) {
                case 1:
                    addListing();
                    break;
                case 2:
                    viewAllListings();
                    break;
                case 3:
                    searchListings();
                    break;
                case 4:
                    reportService.generateMarketSummary(listingService.getAll());
                    break;
                case 5:
                    removeListing();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
       
        scanner.close();
    }
   
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(30));
        System.out.println("1. Add a listing");
        System.out.println("2. View all listings");
        System.out.println("3. Search listings");
        System.out.println("4. Market summary report");
        System.out.println("5. Remove a listing");
        System.out.println("0. Exit");
        System.out.println("=".repeat(30));
    }
   
    private static void addListing() {
        System.out.println("\n--- Add New Listing ---");
        System.out.println("1. Textbook");
        System.out.println("2. Electronics");
        System.out.println("3. Clothing");
        int type = getIntInput("Select type: ");
       
        String name = getStringInput("Title: ");
        double price = getDoubleInput("Price: ");
        String seller = getStringInput("Seller name: ");
       
        switch (type) {
            case 1:
                String courseCode = getStringInput("Course code: ");
                listingService.addListing(new TextBook(name, price, seller, courseCode));
                break;
            case 2:
                String brand = getStringInput("Brand: ");
                listingService.addListing(new Electronics(name, price, seller, brand));
                break;
            case 3:
                String size = getStringInput("Size (S/M/L/XL): ");
                listingService.addListing(new Clothing(name, price, seller, size));
                break;
            default:
                System.out.println("Invalid type. Listing not added.");
                return;
        }
        System.out.println("Listing added successfully!");
    }
   
    private static void viewAllListings() {
        System.out.println("\n--- All Listings ---");
        ArrayList<Item> listings = listingService.getAll();
        if (listings.isEmpty()) {
            System.out.println("No listings available.");
            return;
        }
        for (int i = 0; i < listings.size(); i++) {
            System.out.println(i + ". " + listings.get(i).getSummary());
        }
    }
   
    private static void searchListings() {
        String keyword = getStringInput("Enter keyword to search: ");
        List<Item> results = listingService.searchByKeyword(keyword);
       
        System.out.println("\n--- Search Results ---");
        if (results.isEmpty()) {
            System.out.println("No listings found matching '" + keyword + "'");
            return;
        }
        for (Item item : results) {
            System.out.println(item.getSummary());
        }
    }
   
    private static void removeListing() {
        viewAllListings();
        if (listingService.getAll().isEmpty()) {
            return;
        }
        int index = getIntInput("Enter index number to remove: ");
        if (listingService.removeByIndex(index)) {
            System.out.println("Listing removed successfully!");
        } else {
            System.out.println("Invalid index. No listing removed.");
        }
    }
   
    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
   
    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
   
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
