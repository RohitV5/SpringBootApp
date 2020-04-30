package io.rohitv5.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// This is a generic way to start a spring method with this annotation
// @SpringBootApplication.  //You can annotate class , methods and variables.
@SpringBootApplication
public class CourseApiApp {

	// Standalone app entry point is the Main method
	public static void main(String[] args) {    
		//we are calling a static method and passing it the name of the class where we have our Main method.		
		SpringApplication.run(CourseApiApp.class, args);
	}

}
