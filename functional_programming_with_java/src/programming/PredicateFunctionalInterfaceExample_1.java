package programming;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample_1 {

	public static void main(String[] args) {

//		Predicate<Integer> p = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t > 20;
//			}
//		};

		/*
		 * instead of structural programming we can make use of functional programming
		 * by using Lambda expression
		 */
		Predicate<Integer> p = i -> i > 20;

		System.out.println(p.test(15));

		System.out.println(p.test(21));

		System.out.println(p.test(200));
	}

}
