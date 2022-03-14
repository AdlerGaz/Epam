package by.epam.java_introduction.basic;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class LoopTask7 {
	public static void main(String[] args) {
		int m;
		int n;

		m = LoopTask1.enterPositiveInt("Введите значение m: ");
		n = LoopTask1.enterPositiveInt("Введите значение n: ");

		while (m > n) {
			m = LoopTask1.enterPositiveInt("Введите значение m: ");
			n = LoopTask1.enterPositiveInt("Введите значение n: ");
		}

		for (int i = m; i <= n; i++) {
			System.out.println("Делители для числа " + i + ":");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

}
