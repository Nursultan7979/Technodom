package org.example;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<CartItem> items;
    public Order() {
        this.items = new ArrayList<>();
    }
    public void addItem(CartItem item) {
        items.add(item);
    }
    public List<CartItem> getItems() {
        return items;
    }
}
