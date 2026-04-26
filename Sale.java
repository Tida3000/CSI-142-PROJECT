public class Sale {
    private String itemName;
    private String category;
    private double price;

    public Sale(String itemName, String category, double price) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}