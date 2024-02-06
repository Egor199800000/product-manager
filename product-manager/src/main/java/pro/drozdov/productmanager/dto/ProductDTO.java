package pro.drozdov.productmanager.dto;

public class ProductDTO {

    private String name;
    private Short amount;

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
}
