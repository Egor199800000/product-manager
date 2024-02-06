package pro.drozdov.productmanager.service;

import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.entity.Category;
import pro.drozdov.productmanager.repo.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> readAll(){
        return categoryRepository.findAll();
    }

    public Category readById(Long id){
        return categoryRepository.findById(id).orElseThrow(()->
                new RuntimeException("Category not found"+id));
    }
}
