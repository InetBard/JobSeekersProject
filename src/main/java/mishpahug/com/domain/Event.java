package mishpahug.com.domain;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="events-mishpahug")
public class Event {
	@Id
	int id;
	String title;
	List<String> holiday;
	String address;
	LocalDate from;
	LocalDate to;
	List<String> confession;
	List<String> typeOfKitchen;
	String aboutEvent;
	String status;
}
