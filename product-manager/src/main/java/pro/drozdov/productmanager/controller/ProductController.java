package pro.drozdov.productmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.drozdov.productmanager.dto.ProductDTO;
import pro.drozdov.productmanager.entity.Product;
import pro.drozdov.productmanager.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDTO dto){
        return new ResponseEntity<>(productService.create(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>> readAll(){
        return new ResponseEntity<>(productService.readAll(),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Product> update(@RequestBody Product product){
        return new ResponseEntity<>(productService.update(product),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id){
        productService.delete(id);
        return HttpStatus.OK;
    }



}
