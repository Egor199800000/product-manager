package pro.drozdov.productmanager.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.drozdov.productmanager.entity.MyUser;
import pro.drozdov.productmanager.service.SecurityService;
import pro.drozdov.productmanager.service.SecurityServiceImpl;
import pro.drozdov.productmanager.service.UserDetailsServiceImpl;
import pro.drozdov.productmanager.service.UserService;


import java.util.Map;

@RestController
public class SecurityController {

    @Autowired
    UserService userService;

    @Autowired
    SecurityService securityService;


//    @Bean//инжектим НАШ UserDetailsService
//    public UserDetailsService userDetailsService(UserRepository userRepository){//DataSource-объект через который осуществляет доступ PostgresSQL-драйвер
//        return new UserPrincipalDetailsService(userRepository);
//    }


    @GetMapping("/api")
    public ResponseEntity<Map<String,String>> getGreetings(){
        String loggedUsername=securityService.findLoggedInUsername();
        MyUser user=userService.findByUsername(loggedUsername);
        securityService.autoLogin(user.getUsername(),user.getPassword());

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Map.of("greeting","Hello v1, %s!"
                        .formatted(loggedUsername)));
    }


//    @GetMapping("/api")
//    public ResponseEntity<Map<String,String>> updateUser(@RequestBody String data){
//        //Получаем авторизованного пользователя
//        UserDetails userDetails= (UserDetails) SecurityContextHolder.getContext()
//                .getAuthentication().getPrincipal();
////приветствие
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(Map.of("greeting","Hello v1, %s!"
//                        .formatted(userDetails.getUsername())));
//    }





}
