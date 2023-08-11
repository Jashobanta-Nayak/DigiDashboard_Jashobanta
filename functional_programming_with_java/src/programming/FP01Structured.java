package programming;

import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {

		printAllNumbersInlistStructured(List.of(4, 25, 57, 7, 43, 96, 88, 86, 46, 3, 32));
		System.out.println();
		printEvenNumbersInlistStructured(List.of(4, 25, 57, 7, 43, 96, 88, 86, 46, 3, 32));

	}

	static void printAllNumbersInlistStructured(List<Integer> lst) {

//		// iterate using for loop
//		for (int i = 0; i < lst.size(); i++) {
//			System.out.print(lst.get(i) + " ");
//
//		}
//		System.out.println();
		// iterate using for_each loop
		System.out.println("FOr_each loop: ");

		for (int lt : lst) {
			System.out.print(lt + " ");
		}
	}


	static void printEvenNumbersInlistStructured(List<Integer> lst) {

		// iterate using for_each loop
		System.out.println("Even numbers in list: ");

		for (int number : lst) {
			if (number % 2 == 0) {
				System.out.print(number + " ");
			}
		}

	}

}
