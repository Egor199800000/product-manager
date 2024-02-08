package pro.drozdov.productmanager.service;

import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.dto.ProductDTO;
import pro.drozdov.productmanager.entity.Product;
import pro.drozdov.productmanager.repo.ProductDao;

import java.util.List;

@Service
public class ProductService {
    private final ProductDao productRepository;

    private final CategoryService categoryService;

    public ProductService(ProductDao productRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
    }


    public Product create(ProductDTO dto){
        return productRepository.save(Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .category(categoryService.readById(dto.getCategoryId()))
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

    public List<Product> readByCategoryId(Long id){
        return productRepository.findByCategoryId(id);
    }



}
