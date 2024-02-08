package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.drozdov.productmanager.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}