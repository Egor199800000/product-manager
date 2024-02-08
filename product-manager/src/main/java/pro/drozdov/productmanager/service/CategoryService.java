package pro.drozdov.productmanager.service;

import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.entity.Category;
import pro.drozdov.productmanager.repo.CategoryDao;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryDao categoryRepository;

    public CategoryService(CategoryDao categoryRepository) {
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
