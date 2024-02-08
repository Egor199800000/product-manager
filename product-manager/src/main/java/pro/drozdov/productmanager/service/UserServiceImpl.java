package pro.drozdov.productmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.entity.Role;
import pro.drozdov.productmanager.entity.User;
import pro.drozdov.productmanager.repo.RoleDao;
import pro.drozdov.productmanager.repo.UserDao;
import pro.drozdov.productmanager.service.interfaces.UserService;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {//в контроллере сюда должен прийти регистрирующийся юзер
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override//возможно: в контроллере нужно получить имя пользователя и воспользоваться этим методом для поиска юзера
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
