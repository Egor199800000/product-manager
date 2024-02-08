package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.drozdov.productmanager.entity.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category,Long> {

}
