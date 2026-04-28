error id: file:///C:/Users/ADMIN/CSI-142-PROJECT/src/model/Item.java:java/lang/IllegalArgumentException#
file:///C:/Users/ADMIN/CSI-142-PROJECT/src/model/Item.java
empty definition using pc, found symbol in pc: java/lang/IllegalArgumentException#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 316
uri: file:///C:/Users/ADMIN/CSI-142-PROJECT/src/model/Item.java
text:
```scala

package model;

public abstract class Item {
    private String ItemName;
    private String SellerName;
    private Category category;
    private double price;

    public Item(String itemName, String sellerName, Category category, double price) {
        if (price < 0) {
            throw new Illegal@@ArgumentException("Price cannot be negative.");
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
        return price;
    }
    
    public abstract String getSummary();
} 

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/IllegalArgumentException#