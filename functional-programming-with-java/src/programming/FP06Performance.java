package programming;

import java.util.List;

public class FP06Performance {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , 
				"Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		// stop execution after finding first element.
		courses.stream().peek(System.out::println).filter(course -> course.length() > 11)
			.map(String::toUpperCase).peek(System.out::println).findFirst(); 
		
		// will not execute, don't have ternimal operation
		courses.stream().peek(System.out::println).filter(course -> course.length() > 11)
		.map(String::toUpperCase).peek(System.out::println);
	}
}
