package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SpringApplication.run(CourseApiApp.class, args); 
			//We are passing the class courseapi app.
			
			/***
			 * Some notes for self:
			 * 	It performs class path scan to read different annotations (e.g. controllers, classes, etc)
			 * 	
			 * Starts tomcat server. We did not have to download and install tomcat server because it came with springboot.
			 * So we do not have to create a servlet container 
		    ***/
	}

}
