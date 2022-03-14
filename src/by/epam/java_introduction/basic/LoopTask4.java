package by.epam.java_introduction.basic;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class LoopTask4 {
	public static void main(String[] args) {
		long result;

		result = 1;

		for (int i = 1; i <= 200; i++) {
			if (result == 0) {
				result = 1;
			}
			result *= (i * i);
			System.out.println(result);
		}

		System.out.println("Произведение квадратов первых 200-от чисел равно: " + result);
	}

}
