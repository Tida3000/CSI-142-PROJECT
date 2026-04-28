package service;

import contracts.Searchable;
import java.util.ArrayList;
import java.util.List;
import model.Item;

public class ListingService {
    private ArrayList<Item> listings = new ArrayList<>();
    
    public void addListing(Item item) {
        listings.add(item);
    }
    
    public ArrayList<Item> getAll() {
        return listings;
    }
    
    public List<Item> searchByKeyword(String keyword) {
        List<Item> results = new ArrayList<>();
        for (Item item : listings) {
            if (item instanceof Searchable) {
                if (((Searchable) item).matchesSearch(keyword)) {
                    results.add(item);
                }
            }
        }
        return results;
    }
    
    public boolean removeByIndex(int index) {
        if (index < 0 || index >= listings.size()) {
            return false;
        }
        listings.remove(index);
        return true;
    }
    
    public int size() {
        return listings.size();
    }
}