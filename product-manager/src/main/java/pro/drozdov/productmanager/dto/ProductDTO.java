package pro.drozdov.productmanager.dto;

import lombok.Builder;

@Builder
public class ProductDTO {

    private String name;
    private Short amount;
    private Long categoryId;

    public ProductDTO() {
    }

    public ProductDTO(String name, Short amount, Long categoryId) {
        this.name = name;
        this.amount = amount;
        this.categoryId = categoryId;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
