package com.raven.model;

import javax.swing.Icon;

public class ModelItem {

    public int getProductId() {
        return productId;
    }

    public void setProductId(int itemID) {
        this.productId = itemID;
    }

    public String getItemName() {
        return itemName;
    }
    

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String cat) {
        this.category = cat;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qty) {
        this.quantity = qty;
    }
    
    public double getDiscout() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ModelItem(int productId, String itemName, String description, double price, int quantity, String brandName, String category, double discount, String date, Icon image) {
        this.productId = productId;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.brandName = brandName;
        this.category = category;
        this.discount = discount;
        this.date = date;
        this.image = image;
    }

    public ModelItem() {
    }

    private int productId;
    private String itemName;
    private String description;
    private double price;
    private int quantity;
    private String brandName;
    private String category;
    private double discount;
    private String date;
    private Icon image;

}
