package programming;

import java.util.ArrayList;
import java.util.List;

public class FP07ModifyingList {

	public static void main(String[] args) {
	
		List<String> courses = List.of("Spring", "Spring Boot", "API" , 
				"Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		List<String> modifyableCourse = new ArrayList<>(courses);
		
		modifyableCourse.replaceAll(str -> str.toUpperCase());
		System.out.println(modifyableCourse);
		
		modifyableCourse.removeIf(course -> course.length() < 6);
		System.out.println(modifyableCourse);
		
	}
}
