//package pro.drozdov.productmanager.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import pro.drozdov.productmanager.entity.MyUser;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class UserPrincipal implements UserDetails {
//
//    private MyUser user;
//
//    public UserPrincipal(MyUser user) {
//        this.user = user;
//    }
//
//    @Bean
//    public MyUser getUser() {
//        return user;
//    }
//    @Autowired
//    public void setUser(MyUser user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> authorities=new ArrayList<>();
//        this.user.getRoleList().forEach(r->{
//            GrantedAuthority authority=new SimpleGrantedAuthority("ROLE"+r);
//            authorities.add(authority);
//        });
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return user.isAccountNonExpired();
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return user.isAccountNonLocked();
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return user.isCredentialsNonExpired();
//    }
//
//    @Override
//    public boolean isEnabled() {
//        if (user==null){
//            return false;
//        }
//        return user.isEnabled();
//    }
//
//}
