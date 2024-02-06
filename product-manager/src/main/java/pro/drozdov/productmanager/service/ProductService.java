package pro.drozdov.productmanager.service;

import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.dto.ProductDTO;
import pro.drozdov.productmanager.entity.Product;
import pro.drozdov.productmanager.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(ProductDTO dto){
        return productRepository.save(Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .build());
    }

    public List<Product> readAll(){
        return productRepository.findAll();
    }

    public Product update(Product product){
        return productRepository.save(product);
    }

    public void delete(Long id){
         productRepository.deleteById(id);
    }



}
