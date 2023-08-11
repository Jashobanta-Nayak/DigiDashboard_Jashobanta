package programming;

import java.util.List;
import java.util.Optional;

public class FP08MaxExample {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(53, 12, 24, 4, 87, 34, 9, 76, 2);
		Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
//		System.out.println(maxNumber.orElse(-1));

		maxNumber.ifPresent(n -> System.out.println(n));
	}

}
