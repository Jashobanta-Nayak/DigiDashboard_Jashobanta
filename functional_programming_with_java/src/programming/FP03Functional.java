package programming;

import java.util.List;

public class FP03Functional {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 25, 50, 7, 14, 16, 8, 86, 6, 3, 30, 2);
		printSquareOfNumbersInlistFuynctional(numbers);

	}

	static void printSquareOfNumbersInlistFuynctional(List<Integer> numbers) {
		System.out.println("Square of numbers in list: ");
		numbers.stream().map(n -> n * n).forEach(System.out::println);

	}

}
