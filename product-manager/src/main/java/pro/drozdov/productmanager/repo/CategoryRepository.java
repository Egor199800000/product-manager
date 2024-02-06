package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.drozdov.productmanager.entity.Category;
import pro.drozdov.productmanager.entity.Product;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
