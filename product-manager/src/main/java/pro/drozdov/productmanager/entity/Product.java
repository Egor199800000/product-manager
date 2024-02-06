package pro.drozdov.productmanager.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Short amount;

    @ManyToOne //1 категория-> много продуктов
    @JoinColumn(name="category_id")
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, Short amount, Category category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
