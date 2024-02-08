package pro.drozdov.productmanager.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pro.drozdov.productmanager.entity.MyUser;
import pro.drozdov.productmanager.entity.Role;
import pro.drozdov.productmanager.repo.UserRepository;


import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl
        implements UserDetailsService {

    @Autowired
    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public Authentication getAuth(){
////так можно получить аутентифицированного пользователя
//        return SecurityContextHolder.getContext().getAuthentication();
//    }

    //этот метод преобразовывает нашего юзера в юзера из spring security
    @Override//Задача-дать нашему пользователю разрешение
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        MyUser user=userRepository.findByUsername(username);
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        for (Role role:user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new User(user.getUsername(),user.getPassword(),grantedAuthorities);
    }


}
