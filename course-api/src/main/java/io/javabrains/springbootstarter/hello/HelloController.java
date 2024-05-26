package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //By putting this annotation we made this class a REST Controller.
public class HelloController {
	
	
		// The methods in this class will map to url requests.
	
		@RequestMapping("/hello")  /*  This annotation tells the spring framework that whenever there is a request(a http request) to this app at the url "/hello", 
										we want the following method to be executed and return whatever value it has to return 
									
 									* This way of mapping is only for a GET because that's the default method. To map to other HTTP methods, we will have to specify it in the annotation.
 									* Since we put this class in the class path, the spring framework scans it and finds the annotations(spring framework does a class path scan when it starts) 
 									* and knows that its a controller
 									* 
									*/
		public String sayHi() {
			return "Hi";
		}
		
		
		
	
	
}
