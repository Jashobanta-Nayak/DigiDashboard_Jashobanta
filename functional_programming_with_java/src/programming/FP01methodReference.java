package programming;

import java.util.List;

public class FP01methodReference {

	public static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
	 List<String> courses=List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernates");
	 
		courses.stream().map(String::toUpperCase).forEach(FP01methodReference::print);
	}

}
