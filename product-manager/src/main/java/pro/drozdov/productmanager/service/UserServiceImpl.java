package pro.drozdov.productmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.entity.MyUser;
import pro.drozdov.productmanager.entity.Role;
import pro.drozdov.productmanager.repo.RoleRepository;
import pro.drozdov.productmanager.repo.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;



    @Override
    public void save(MyUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles=new HashSet<>();
        roles.add(roleRepository.getOne(1L));
        user.setRoles(roles);
        userRepository.save(user);

    }

    @Override
    public MyUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}


