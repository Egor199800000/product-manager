package pro.drozdov.productmanager.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HomeController {

    @GetMapping("/welcome")
    public String home() {
        return "Hello, World!";
    }


    @GetMapping("/user")
    public String user() {
        return "Hello, User!";
    }


    @GetMapping("/admin")
    public String admin() {
        return "Hello, Admin!";
    }

}
