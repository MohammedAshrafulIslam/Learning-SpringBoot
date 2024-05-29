package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics") //String MVC is going to convert the list of topic objects into JSON and the JSON will get returned.
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				
				new Topic("OOP","Some OOP concepts", 1),
				new Topic("Web Design", "HTML CSS & JS", 2),
				new Topic("Data Analysis", "Python, Power Bi & more", 3)
						
				);
	}

}
