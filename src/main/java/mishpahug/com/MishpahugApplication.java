package mishpahug.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mishpahug.com.service.UserService;

@SpringBootApplication
public class MishpahugApplication {
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MishpahugApplication.class, args);
	}

}
