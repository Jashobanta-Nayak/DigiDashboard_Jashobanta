package lambda_expression;

public class MathOperationMain {
	public static void main(String[] args) {
		MathOperation mo = (a, b) -> a + b;

		int a = 20, b = 30;
		int add = mo.addition(a, b);
		System.out.println("Addition of " + a + " and " + b + " is " + add);
	}

}
