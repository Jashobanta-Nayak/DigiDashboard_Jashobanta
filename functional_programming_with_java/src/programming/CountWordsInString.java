package programming;

public class CountWordsInString {
	public static void main(String[] args) {
		String str = "Hello, this is a sample string with some words.";

		int wordCount = countWord(str);
		System.out.println("Total word present in: " + str + " is: " + wordCount);
	}

	private static int countWord(String str) {

		if (str == null || str.isEmpty()) {
			return 0;
		}
		String[] words = str.trim().split("\\s+");
		return words.length;
	}

}
