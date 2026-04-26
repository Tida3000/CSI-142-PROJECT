package model;

import java.util.ArrayList;

public class User {
    private String name;
    private String studentId;
    private ArrayList<Item> postedItems;
   
    public User(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.postedItems = new ArrayList<>();
    }
   
    public String getName() {
        return name;
    }
   
    public String getStudentId() {
        return studentId;
    }
   
    public ArrayList<Item> getPostedItems() {
        return postedItems;
    }
   
    public void addPostedItem(Item item) {
        postedItems.add(item);
    }
   
    @Override
    public String toString() {
        return name + " (" + studentId + ")";
    }
}