package programming;

import java.util.List;

public class FP02Functional {
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernates");
		// print all the course name whose length is at least 4
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

		System.out.println("******************");
		// print the course name along with length of the course
		courses.stream().map(c -> c + " : " + c.length()).forEach(System.out::println);

	}

}
