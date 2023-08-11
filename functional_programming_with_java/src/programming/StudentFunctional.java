package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentFunctional {

	private int id;
	private String course;

	public StudentFunctional(int id, String course) {
		this.id = id;
		this.course = course;
	}

	// Getters for the attributes (id, course)

	public int getId() {
		return this.id;
	}

	public String getCourse() {
		return this.course;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", course='" + course + '\'' + '}';
	}

	public static void main(String[] args) {
		List<StudentFunctional> students = Arrays.asList(new StudentFunctional(1, "Math"),
				new StudentFunctional(2, "Science"), new StudentFunctional(3, "Math"),
				new StudentFunctional(4, "History"), new StudentFunctional(5, "Science"));

		Map<String, List<StudentFunctional>> studentsByCourse = students.stream()
				.collect(Collectors.groupingBy(StudentFunctional::getCourse));

		System.out.println(studentsByCourse);

	}
}