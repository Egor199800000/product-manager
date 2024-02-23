//package pro.drozdov.productmanager.service;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import pro.drozdov.productmanager.entity.UserPrincipal;
//import pro.drozdov.productmanager.repo.UserDao;
//
//@Service
//public class JpaUserDetailsService implements UserDetailsService {
//
//    private final UserDao userDao;
//
//    public JpaUserDetailsService(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userDao
//                .findByUsername(username)
//                .map(UserPrincipal::new)
//                .orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
//    }
//}
