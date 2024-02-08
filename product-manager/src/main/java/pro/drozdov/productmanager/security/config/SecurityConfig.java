//package pro.drozdov.productmanager.security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//public class SecurityConfig {
//
//
//        @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.
//                httpBasic().and()
//                .authorizeHttpRequests() // пользователь должен быть аутенфицирован
//                .anyRequest().authenticated().and() //ко всем запросом имеет доступ аутен-й пользователь
//                .logout().permitAll().and()
//                .build();
//    }
//
//}
