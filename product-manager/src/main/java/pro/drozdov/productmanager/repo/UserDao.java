package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.drozdov.productmanager.entity.User;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}