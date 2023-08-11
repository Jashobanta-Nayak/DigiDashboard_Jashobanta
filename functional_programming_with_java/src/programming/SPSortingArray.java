package programming;

import java.util.Arrays;

public class SPSortingArray {

	public static void arraySortingAsc(int[] arr1) {

		for (int i = 0; i <= arr1.length; i++) {
			for (int j = i; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

	public static void arraySortingDesc(int[] arr2) {

		for (int i = 0; i <= arr2.length; i++) {
			for (int j = i; j < arr2.length; j++) {
				if (arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 34, 5, 54, 3, 76, 89, 2, 6 };

		System.out.print("Array before sorting: ");
		for (int displayArr : arr) {
			System.out.print(displayArr + " ");
		}

		System.out.println();
		System.out.print("Array after ascending sort: ");
		arraySortingAsc(arr);

		System.out.println();
		System.out.print("Array after descending sort: ");
		arraySortingDesc(arr);

	}

}
