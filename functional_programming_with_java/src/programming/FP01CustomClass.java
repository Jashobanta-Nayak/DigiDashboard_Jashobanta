package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {

	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return name + ":" + category + ":" + reviewScore + ":" + noOfStudents;
	}

}

public class FP01CustomClass {

	public static void main(String[] args) {

		List<Course> course = List.of(new Course("Spring", "framework", 98, 20000),
				new Course("Spring Boot", "framework", 95, 18000), new Course("API", "Microservice", 97, 22000),
				new Course("Microservices", "JS Microservices", 96, 25000),
				new Course("Fullstack", "Fullstack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Cubernate", "Cloud", 91, 20000));

		Predicate<Course> reviewScoreGreaterThan95Predicate = score -> score.getReviewScore() > 95;

		Predicate<Course> reviewScoreGreaterThan90Predicate = score -> score.getReviewScore() < 90;

		Predicate<Course> reviewScoreLessThan90Predicate = score -> score.getReviewScore() < 90;

		System.out.println(course.stream().allMatch(reviewScoreGreaterThan95Predicate));

		System.out.println(course.stream().noneMatch(reviewScoreGreaterThan90Predicate));

		System.out.println(course.stream().anyMatch(reviewScoreLessThan90Predicate));

		Comparator<Course> comparingByNumberOfStudents = Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore);
		System.out.println(course.stream().sorted(comparingByNumberOfStudents.reversed()).collect(Collectors.toList()));

		System.out.println(
				course.stream().filter(reviewScoreGreaterThan95Predicate).mapToInt(Course::getNoOfStudents).sum());
		System.out.println(course.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

	}

}
