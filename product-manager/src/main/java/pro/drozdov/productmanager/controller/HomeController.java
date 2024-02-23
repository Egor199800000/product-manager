package pro.drozdov.productmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pro.drozdov.productmanager.entity.User;
import pro.drozdov.productmanager.service.UserService;

@RestController
@RequestMapping("api")
public class HomeController {

    @Autowired
   private UserService service;

    @GetMapping("/welcome")
    public String home() {
        return "Hello, World!";
    }


    @GetMapping("/user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String user() {
        return "Hello, User!";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String admin() {
        return "Hello, Admin!";
    }


    @PostMapping("/new-user")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')") //добавлять новых пользователей вручную может только админ
    public String addUser(@RequestBody User user){
        service.addUser(user);
        return "User add and save";

    }

}
