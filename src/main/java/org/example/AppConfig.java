package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean
    public User user() {
        return new User(1, "Тулеген Нурбол");
    }
    @Bean
    public Category electronics() {
        return new Category(1, "Электроника", "Технические устройства");
    }
    @Bean
    public Category foto() {
        return new Category(2, "Фототехника", "Фототехника и аксессуары");
    }
    @Bean
    public Product phone() {
        return new Product(1, "Смартфон", 169000, "Смартфон с хорошими характеристиками", electronics());
    }
    @Bean
    public Product photo() {
        return new Product(2, "Зеркальный фотоаппарат", 179000, "Снимайте и делитесь без лишних усилий", foto());
    }
}
