package programming;

import java.util.List;

public class FP04Functional {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 30, 10, 9, 6, 4);

		int result = printSumOfElementsInList(numbers);
		System.out.println("Sum of the elements in list using reduce method: " + result);

		int sum = printSumOfElementsInListUsingSumMethod(numbers);
		System.out.println("Sum of the elements in list using reduce method with sum() of Integer class: " + sum);

		int max = printMaxElementsInList(numbers);
		System.out.println("Max of the elements in list using reduce method: " + max);

		int min = printMinElementsInList(numbers);
		System.out.println("min of the elements in list using reduce method: " + min);
	}

	static int printMinElementsInList(List<Integer> numbers) {
		int min = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? b : a);
		return min;
	}

	static int printMaxElementsInList(List<Integer> numbers) {
		int max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		return max;
	}

	static int printSumOfElementsInList(List<Integer> numbers) {
		Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);

		return reduce;
	}

	static int printSumOfElementsInListUsingSumMethod(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, Integer::sum);

		return sum;
	}

}
