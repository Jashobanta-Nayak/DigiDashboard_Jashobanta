package programming;

import java.util.function.Function;

public class FunctionFunctionalInterfaceExample_1 {

	public static void main(String[] args) {

		/*
		 * Function<String, Integer> f = new Function<String, Integer>() {
		 * 
		 * @Override public Integer apply(String t) { return t.length(); } };
		 */

		/*
		 * instead of structural programming we can make use of functional programming
		 * by using Lambda expression
		 */
		Function<String, Integer> f = s -> s.length();

		System.out.println(f.apply("Jashobanta"));
	}
}