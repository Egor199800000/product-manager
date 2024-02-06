package pro.drozdov.productmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.drozdov.productmanager.entity.Category;
import pro.drozdov.productmanager.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/categorys")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> readAll(){
        return new ResponseEntity<>(categoryService.readAll(), HttpStatus.OK);
    }
}
