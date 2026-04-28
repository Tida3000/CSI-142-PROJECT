package service;

import model.Item;
import java.util.*;

public class ReportService {
    
    public void generateMarketSummary(ArrayList<Item> listings) {
        System.out.println("\n" + "*".repeat(35));
        System.out.println("*** MARKET SUMMARY REPORT ***");
        System.out.println("*".repeat(35));
        
        if (listings.isEmpty()) {
            System.out.println("No listings yet.");
            return;
        }
        
        double total = 0;
        Map<String, ArrayList<Double>> byCategory = new HashMap<>();
        
        for (Item item : listings) {
            total += item.getPrice();
            byCategory.computeIfAbsent(item.getCategory(), k -> new ArrayList<>()).add(item.getPrice());
        }
        
        System.out.printf("Total listings: %d\n", listings.size());
        System.out.printf("Overall average price: P%.2f\n", total / listings.size());
        
        System.out.println("\n--- By Category ---");
        for (Map.Entry<String, ArrayList<Double>> entry : byCategory.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.printf("  %-12s: P%.2f (%d items)\n", entry.getKey(), avg, entry.getValue().size());
        }
        
        System.out.println("*".repeat(35));
    }
}