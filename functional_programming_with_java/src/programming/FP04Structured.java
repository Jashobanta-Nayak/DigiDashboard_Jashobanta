package programming;

import java.util.List;

public class FP04Structured {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 30, 10, 9, 6, 4);

		int result = printSumOfElementsInList(numbers);
		System.out.println("Sum of elements: " + result);
	}

	static int printSumOfElementsInList(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}


}
