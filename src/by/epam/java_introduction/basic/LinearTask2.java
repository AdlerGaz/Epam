package by.epam.java_introduction.basic;

import java.util.Scanner;

/*
 * Вычислить значение: 
 * 		((b + Math.sqrt(b * b + 4ac)) / 2a) - Math.pow(a, 3) * c + Math.pow(b, -2)
 */

public class LinearTask2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		a = enterDouble("a = ");
		b = enterDouble("b = ");
		c = enterDouble("c = ");

		result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println(result);

	}

	public static double enterDouble(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double number;

		System.out.print(message);

		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.print(message);
		}
		number = scanner.nextDouble();

		return number;
	}

}
