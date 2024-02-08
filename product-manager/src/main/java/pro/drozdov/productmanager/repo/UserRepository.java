package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.drozdov.productmanager.entity.MyUser;

public interface UserRepository extends JpaRepository<MyUser,Long> {

    MyUser findByUsername(String username);
}
