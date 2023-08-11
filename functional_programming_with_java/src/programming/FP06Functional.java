package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP06Functional {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(99, 88, 7, 44, 5, 44, 66, 88, 32, 23, 23);

		List<Integer> sorted = sortedSortElementsInList(numbers);
		System.out.println("Elements after sorting:" + sorted);

		List<Integer> distinctElement = distinctElementsInList(numbers);
		System.out.println("Elements after using distinct method:" + distinctElement);
	}

	static List<Integer> distinctElementsInList(List<Integer> numbers) {
		List<Integer> DistinctElement = numbers.stream().distinct().collect(Collectors.toList());
		return DistinctElement;
	}

	static List<Integer> sortedSortElementsInList(List<Integer> numbers) {
		List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());

		return sorted;

	}

}
