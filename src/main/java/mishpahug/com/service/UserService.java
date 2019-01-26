package mishpahug.com.service;

import org.springframework.stereotype.Service;

import mishpahug.com.domain.User;
import mishpahug.com.dto.UserProfileDto;
@Service
public interface UserService {
	User addUser(String token);

//	UserResponseDto deleteUser(int id, String token);
//
	User editUser(String token);
//
//	UserResponseDto getUser(int id);

	UserProfileDto userAuthorization(String token);

	
}
