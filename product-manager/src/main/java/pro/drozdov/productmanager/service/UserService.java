package pro.drozdov.productmanager.service;

import pro.drozdov.productmanager.entity.MyUser;

public interface UserService {

    void save(MyUser user);

    MyUser findByUsername(String username);

}
