package by.epam.java_introduction.basic;

import java.util.Scanner;

/*
 * Найдите значение функции: z = ( (a - 3) * b / 2) + c  
 */

public class LinearTask1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		double result;

		a = enterNumber("a = ");
		b = enterNumber("b = ");
		c = enterNumber("c = ");

		result = ((a - 3) * b / 2.0) + c;

		System.out.println(result);

	}

	public static int enterNumber(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.print(message);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.print(message);
		}
		number = scanner.nextInt();

		return number;
	}

}
