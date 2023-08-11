package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberUsingStream {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(32, 1, 34, 54, 2225, 87, 98, 122, 544);
		List<Integer> sortedNumber = numbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedNumber.get(sortedNumber.size() - 3));
	}
}
