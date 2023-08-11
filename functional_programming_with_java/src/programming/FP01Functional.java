package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 25, 57, 7, 43, 96, 88, 86, 46, 3, 32, 2);
		printEvenNumbersInlistFuynctional(numbers);
		printOddNumbersInlistFuynctional(numbers);

	}

	static void printEvenNumbersInlistFuynctional(List<Integer> numbers) {
		System.out.println("Even numbers in list: ");
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

	static void printOddNumbersInlistFuynctional(List<Integer> numbers) {
		System.out.println("Odd numbers in list: ");
		numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
	}
}
