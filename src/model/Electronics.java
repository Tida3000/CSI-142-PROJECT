package model;

import contracts.Searchable;

public class Electronics extends Item implements Searchable {
    private String brand;
    
    public Electronics(String name, double price, String sellerName, String brand) {
        super(name, price, sellerName, "Electronics");
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    @Override
    public String getSummary() {
        return "[ELECTRONICS] " + getName() + " | Brand: " + brand + " | P" + getPrice() + " | Seller: " + getSellerName();
    }
    
    @Override
    public boolean matchesSearch(String keyword) {
        String kw = keyword.toLowerCase();
        return getName().toLowerCase().contains(kw) ||
               brand.toLowerCase().contains(kw) ||
               getCategory().toLowerCase().contains(kw);
    }
}