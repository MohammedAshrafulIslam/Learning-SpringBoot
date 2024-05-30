package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


/*
 * When the application starts its going detect in the class path all the classes which have 
 * @Service annotation and it's going create an instance of all those classes, its going register them(like its going make a note of it)
 * And now in any other class if we want an instance of this service class spring is going to inject it to the classes that need this without
 * needing to create new instances every time using the keyword new.
 * 
 * 
 * */


@Service   //This annotation marks this class as a Spring Business Service.
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(		
					new Topic("spring","Spring Framework", "Spring Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("javascript", "JavaScript", "JavaScript Description")
			
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
