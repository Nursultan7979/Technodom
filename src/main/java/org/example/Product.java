package org.example;
import java.util.ArrayList;
import java.util.List;
public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private Category category;
    public Product(int id, String name, int price, String description, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public Category getCategory() {
        return category;
    }
}
