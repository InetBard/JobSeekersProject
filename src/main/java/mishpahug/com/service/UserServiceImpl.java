package mishpahug.com.service;


import java.time.LocalDate;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mishpahug.com.dao.UserRepositrory;
import mishpahug.com.domain.User;
import mishpahug.com.dto.UserProfileDto;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepositrory userRepository;

	@Override
	@Transactional
	public User addUser(String token) {
		String [] auth = decodeToken(token);
		String login = auth[0];
		String password = auth[1];
//		System.err.println(auth[0] + " : " + auth[1] );
		User user = new User(login, password, "firstName", "lastName", "456465456", "confession", LocalDate.now(), "marital", "foodReference", "gender", "languages", "aboutMe", "status");
		return userRepository.save(user);
	}
	private String[] decodeToken(String token) {
		int index = token.indexOf(" ");
		token = token.substring(index + 1);
		byte[] base64DecodeBytes = Base64.getDecoder().decode(token);
		token = new String(base64DecodeBytes);
		String[] auth = token.split(":");
		return auth;
	}

//	@Override
//	public UserResponseDto deleteUser(int id, String token) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	@Override
	public User editUser(String token) {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public UserResponseDto getUser(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public UserProfileDto userAuthorization(String token) {
		
		return null;
	}


}
