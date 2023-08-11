package programming;

public class ReverseStringExample {
	public static void main(String[] args) {
		String name = "Jashobanta";
		name = name.toLowerCase();
		String reverseString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseString = reverseString + name.charAt(i);
		}
		System.out.println(reverseString);
	}

}
