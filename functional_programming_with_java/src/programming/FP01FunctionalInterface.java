package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP01FunctionalInterface {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenPredicate = n -> n % 2 == 0;

		Predicate<Integer> isEvenPredicate1 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				return t % 2 == 0;
			}
		};
		Function<Integer, Integer> squareFunction = n -> n * n;

		Function<Integer, Integer> squareFunction1 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};

		Consumer<Integer> sysoutConsumer = System.out::println;

		Consumer<Integer> sysoutConsumer1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		};

		numbers.stream()
				.filter(isEvenPredicate1)
				.map(squareFunction1)
				.forEach(sysoutConsumer1);


	}

}
