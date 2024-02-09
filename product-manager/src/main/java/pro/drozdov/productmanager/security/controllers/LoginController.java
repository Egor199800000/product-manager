//package pro.drozdov.productmanager.security.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import pro.drozdov.productmanager.service.interfaces.SecurityService;
//import pro.drozdov.productmanager.service.interfaces.UserService;
//
//@RestController
//public class LoginController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private SecurityService securityService;
//
//    @PostMapping("/login")
//    public ResponseEntity<Void> login(@RequestBody LoginRequest loginRequest) {
//        securityService.autoLogin(loginRequest.username(), loginRequest.password());
////
////
////
////        Authentication authenticationRequest =
////                UsernamePasswordAuthenticationToken.unauthenticated(loginRequest.username(), loginRequest.password());
////
////
////
////        Authentication authenticationResponse =
////                this.authenticationManager.authenticate(authenticationRequest);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    public record LoginRequest(String username, String password) {
//    }
//
//}
