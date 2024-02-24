package org.example;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<CartItem> cartItems;
    private Order currentOrder;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
    }

    public void checkout() {
        if (currentOrder == null) {
            currentOrder = new Order();
            for (CartItem item : cartItems) {
                currentOrder.addItem(item);
            }
            cartItems.clear();
            System.out.println("Заказ оформлен.");
        } else {
            System.out.println("Заказ уже оформлен.");
        }
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}