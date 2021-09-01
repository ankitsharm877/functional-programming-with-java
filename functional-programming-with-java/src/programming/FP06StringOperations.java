package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP06StringOperations {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , 
				"Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream().collect(Collectors.joining(" "));
		courses.stream().collect(Collectors.joining(","));
		
		//return list of String[]
		"Spring".split("");
		courses.stream().map(course -> course.split("")).collect(Collectors.toList());
		
		//convert stream of String[] -> stream of Strings
		courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
		courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
	
		List<String> courses2 = List.of("Spring", "Spring Boot", "API" , 
				"Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2)))
				.filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList());
		
		courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length() == course.length()).map(course2 -> List.of(course, course2)))
		.filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList());
	}

}
