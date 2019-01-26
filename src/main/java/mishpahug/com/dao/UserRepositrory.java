package mishpahug.com.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import mishpahug.com.domain.User;

public interface UserRepositrory extends MongoRepository<User, String> {
//	boolean addUser(User user);

//	User deleteUser(String id);
//
	User findUserByLogin(String login);
//
//	User editStudent(User student);
//	
//	List<User> getUsers();
}
