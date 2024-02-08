package pro.drozdov.productmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.drozdov.productmanager.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
