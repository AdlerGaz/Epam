package by.epam.java_introduction.basic;

/*
 * Вычислить значение функции 
 * Math(x, 2) - 3 * x + 9, если x <=3,
 * 1 / (Math(x, 3) + 6), если x > 3
 */

public class BranchTask5 {
	public static void main(String[] args) {
		int x;
		double result;

		x = LinearTask1.enterNumber("Введите значение x: ");

		if (x <= 3) {
			result = Math.pow(x, 2) - (3 * x) + 9;
		} else {
			result = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("Значение функции ровняется: " + result);

	}
}
