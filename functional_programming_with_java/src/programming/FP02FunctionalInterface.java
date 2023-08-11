package programming;

import java.util.List;

public class FP02FunctionalInterface {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 4, 6, 5, 3, 8, 7);

		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}

}
