package pro.drozdov.productmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.drozdov.productmanager.dto.ProductDTO;
import pro.drozdov.productmanager.entity.Product;
import pro.drozdov.productmanager.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDTO dto){
        return mappingResponseProduct(productService.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<Product>> readAll(){
        return mappingResponseListProduct(productService.readAll());
    }

    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product){
        return mappingResponseProduct(product);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id){
        productService.delete(id);
        return HttpStatus.OK;
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> readByCategoryId(@PathVariable Long id){
        return mappingResponseListProduct(productService.readByCategoryId(id));
    }




    private ResponseEntity<Product> mappingResponseProduct(Product product){
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    private ResponseEntity<List<Product>> mappingResponseListProduct(List<Product> products){
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

}
