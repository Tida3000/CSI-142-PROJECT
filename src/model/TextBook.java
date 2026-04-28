package model;

import contracts.Searchable;

public class TextBook extends Item implements Searchable {
    private String courseCode;
    
    public TextBook(String name, double price, String sellerName, String courseCode) {
        super(name, price, sellerName, "Textbook");
        this.courseCode = courseCode;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    @Override
    public String getSummary() {
        return "[TEXTBOOK] " + getName() + " | Course: " + courseCode + " | P" + getPrice() + " | Seller: " + getSellerName();
    }
    
    @Override
    public boolean matchesSearch(String keyword) {
        String kw = keyword.toLowerCase();
        return getName().toLowerCase().contains(kw) ||
               courseCode.toLowerCase().contains(kw) ||
               getCategory().toLowerCase().contains(kw);
    }
}