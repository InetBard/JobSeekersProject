package mishpahug.com.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document(collection="users_mishpahug")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of= {"login"})
public class User {
	@Id
	String login;
	String password;
	String firstName;
	String lastName;
	String phoneNumber;
	String confession;
	LocalDate dateOfBirth;
	String maritalStatus;
	String foodReference;
	String gender;
	String languages;
	String aboutMe;
	String status;
}

