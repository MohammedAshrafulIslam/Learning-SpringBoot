package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired     //Since we are not creating a new object rather spring is doing it for us. So when string creates an instance of this class its going to look at all the member variables
	            // and see if any of them has dependency to topicService and then inject that.
				//so we declare the dependency by Autowired annnotation
	private TopicService topicService; //So by the Autowired annotation, private variable "topicService" got marked as something that needs dependency injection

	@RequestMapping("/topics") //String MVC is going to convert the list of topic objects into JSON and the JSON will get returned.
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}") 
	public Topic getTopic(@PathVariable  String id) {  //PathVariable maps the id in the mapping to parameter in the function.
		return topicService.getTopic(id);
	}

}
