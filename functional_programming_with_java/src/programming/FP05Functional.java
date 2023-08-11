package programming;

import java.util.List;

public class FP05Functional {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 4, 6, 5, 3, 9, 8);
		int sumOfSquare = sumOfSquareOfNumbers(numbers);
		System.out.println("Sum of squares of numbers: " + sumOfSquare);

		int sumOfCube = sumOfCubeOfNumbers(numbers);
		System.out.println("Sum of cubes of numbers: " + sumOfCube);

		int sumOfOdd = sumOfOddOfNumbers(numbers);
		System.out.println("Sum of odd of numbers: " + sumOfOdd);

	}

	static int sumOfOddOfNumbers(List<Integer> numbers) {
		Integer sumOfOdd = numbers.stream().filter(n -> n % 2 != 0).reduce(0, Integer::sum);
		return sumOfOdd;
	}

	static int sumOfCubeOfNumbers(List<Integer> numbers) {
		int sumCube = numbers.stream().map(n -> n * n * n).reduce(0, Integer::sum);
		return sumCube;
	}

	static int sumOfSquareOfNumbers(List<Integer> numbers) {
		int sumSquare = numbers.stream().map(n -> n * n).reduce(0, Integer::sum);
		return sumSquare;
	}

}
