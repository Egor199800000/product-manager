package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.drozdov.productmanager.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
