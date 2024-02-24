package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        user.addToCart(context.getBean("phone", Product.class), 2);
        user.addToCart(context.getBean("photo", Product.class), 3);
        System.out.println("Корзина пользователя:");
        for (CartItem item : user.getCartItems()) {
            System.out.println(item);
        }
        user.checkout();
        context.close();
    }
}
