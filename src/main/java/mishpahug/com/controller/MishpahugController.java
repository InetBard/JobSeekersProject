package mishpahug.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import mishpahug.com.domain.User;
import mishpahug.com.dto.UserProfileDto;
import mishpahug.com.service.UserService;

@RestController
public class MishpahugController {
	@Autowired
	UserService userService;

	@PostMapping("/user/registration")
	public User addUser(@RequestHeader("Authorization") String token) {
		return userService.addUser(token);
	}
	@PostMapping("/user/profile")
	public User editUser(@RequestHeader("Authorization") String token) {
		return userService.editUser(token);
	}
	
	@PostMapping("/user/login")
	public UserProfileDto loginUser(@RequestHeader("Authorization") String token) {
		return userService.userAuthorization(token);
	}
}