package pro.drozdov.productmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pro.drozdov.productmanager.entity.User;
import pro.drozdov.productmanager.entity.UserPrincipal;
import pro.drozdov.productmanager.repo.UserDao;

import java.util.Optional;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private  UserDao repository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user=repository.findByUsername(username);

        return user.map(UserPrincipal::new)
                .orElseThrow(()->new UsernameNotFoundException(username+"not found"));
    }
}
