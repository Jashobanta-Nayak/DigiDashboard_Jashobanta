package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP07Functional {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernate");

		List<String> courseAssc = sortCourseInAssOrder(courses);
		System.out.println("courses after sorting in assending order: " + courseAssc);

		List<String> courseDesc = sortCourseInDescOrder(courses);
		System.out.println("courses after sorting in descending order: " + courseDesc);

		List<String> courseDescLength = sortCourseInDescOrderByCompLength(courses);
		System.out.println("courses after sorting in descending order by comparing length: " + courseDescLength);

		courses.stream().map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);
	}

	static List<String> sortCourseInDescOrderByCompLength(List<String> courses) {

		return courses.stream().sorted(Comparator.comparing(str -> str.length())).collect(Collectors.toList());
	}

	static List<String> sortCourseInDescOrder(List<String> courses) {

		return courses.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	static List<String> sortCourseInAssOrder(List<String> courses) {
		return courses.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	}



}
