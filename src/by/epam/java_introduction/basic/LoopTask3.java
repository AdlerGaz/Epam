package by.epam.java_introduction.basic;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class LoopTask3 {
	public static void main(String[] args) {
		int result;

		result = 0;

		for (int i = 1; i <= 100; i++) {
			result += i * i;
		}

		System.out.println("Сумма квадратов первых ста чесел равна: " + result);
	}
}
