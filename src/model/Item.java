package model;

public abstract class Item {
    private String name;
    private String sellerName;
    private String category;  // Changed from Category enum to String
    private double price;

    public Item(String name, double price, String sellerName, String category) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be negative or zero.");
        }
        this.name = name;
        this.price = price;
        this.sellerName = sellerName;
        this.category = category;
    }

    // Getters 
    public String getName() {
        return name;
    }  

    public String getSellerName() {
        return sellerName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract String getSummary();
}