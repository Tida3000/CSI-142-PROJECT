package model;

import contracts.Searchable;

public class Clothing extends Item implements Searchable {
    private String size;
    
    public Clothing(String name, double price, String sellerName, String size) {
        super(name, price, sellerName, "Clothing");
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }
    
    @Override
    public String getSummary() {
        return "[CLOTHING] " + getName() + " | Size: " + size + " | P" + getPrice() + " | Seller: " + getSellerName();
    }
    
    @Override
    public boolean matchesSearch(String keyword) {
        String kw = keyword.toLowerCase();
        return getName().toLowerCase().contains(kw) ||
               size.toLowerCase().contains(kw) ||
               getCategory().toLowerCase().contains(kw);
    }
}