package pro.drozdov.productmanager.service.interfaces;

import pro.drozdov.productmanager.entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}