package pro.drozdov.productmanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import pro.drozdov.productmanager.entity.User;
import pro.drozdov.productmanager.repo.UserDao;

@SpringBootApplication
public class ProductManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApplication.class, args);
	}




//	@Bean
//	CommandLineRunner commandLineRunner(UserDao users, PasswordEncoder encoder) {
//		return args -> {
//			users.save(new User("user",encoder.encode("password"),"USER"));
//			users.save(new User("admin",encoder.encode("password"),"ROLE_USER,ROLE_ADMIN"));
//		};
//	}

}
