
package model;

public abstract class Item {
    private String ItemName;
    private String SellerName;
    private Category category;
    private double price;

    public Item(String itemName, String sellerName, Category category, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        else {
            this.price = price; 
        }
        this.ItemName = itemName;
        this.SellerName = sellerName;
        this.category = category;
        
    }

    // Getters 
    public String getItemName() {
        return ItemName;
    }  

    public String getSellerName() {
        return SellerName;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        else {
            return price;
        }
        

    }
    public abstract String getsummary();
} 
