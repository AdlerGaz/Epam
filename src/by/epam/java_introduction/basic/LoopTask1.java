package by.epam.java_introduction.basic;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
 * от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class LoopTask1 {

	public static void main(String[] args) {

		int x;
		int result;

		result = 0;
		x = enterPositiveInt("Введите целое положительное число: ");

		for (int i = 1; i <= x; i++) {
			result += i;
		}

		System.out.println(result);

	}

	public static int enterPositiveInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.print(message);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Вы ввели не целое положительное число!");
			System.out.print(message);
		}
		number = scanner.nextInt();

		if (number <= 0) {
			System.out.println("Вы ввели не целое положительное число!");
			number = enterPositiveInt(message);
		}

		return number;
	}
}
