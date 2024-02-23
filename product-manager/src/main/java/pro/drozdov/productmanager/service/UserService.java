package pro.drozdov.productmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.entity.User;
import pro.drozdov.productmanager.repo.UserDao;

@Service
@AllArgsConstructor
public class UserService {
    private UserDao repository;
    private PasswordEncoder passwordEncoder;

    public void addUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }

}
