package by.epam.java_introduction.basic;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: a(n) = 1/Math.pow(2, n) + 1/ Math.pow(3, n)
 */

import java.util.Scanner;

public class LoopTask5 {
	public static void main(String[] args) {
		double e;
		double a;
		double summ;

		summ = 0;
		e = enterPositiveDouble("Введите значение числа e: ");

		for (int i = 1; i < 10; i++) {
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

			if (Math.abs(a) >= e) {
				summ += a;
			}

		}

		System.out.println("Сумма членов ряда равна: " + summ);

	}

	public static double enterPositiveDouble(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double number;

		System.out.print(message);

		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Вы ввели не корректное число!");
			System.out.print(message);
		}
		number = scanner.nextDouble();

		if (number <= 0) {
			System.out.println("Вы ввели не корректное число!");
			number = enterPositiveDouble(message);
		}

		return number;
	}
}
