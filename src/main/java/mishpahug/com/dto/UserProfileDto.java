package mishpahug.com.dto;

import java.time.LocalDate;
import java.util.List;

public class UserProfileDto {
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	String gender;
	String maritalStatus;
	String confession;
	List<String> pictureLink;
	int phoneNumber;
	List<String> foodPreferences;
	List<String> languages;
	String description;
	double rate;
	int numberOfVoters;
}
