package programming;

public class PrintWordsInString {
	public static void main(String[] args) {
		String str = "hey Jashobanta, Welcome to Capgemini service Ltd. !!!";

		String words = printWord(str);
		System.out.println(words);
	}

	private static String printWord(String str) {

		str = str.trim().replaceAll("[^a-zA-Z ]", "");
		String[] splitWord = str.split("\\s+");

		return String.join(" ", splitWord);
	}
}

