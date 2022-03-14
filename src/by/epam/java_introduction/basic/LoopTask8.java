package by.epam.java_introduction.basic;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class LoopTask8 {
	public static void main(String[] args) {
		int first;
		int second;
		int countFirst;
		int countSecond;

		first = LinearTask1.enterNumber("Введите значение 1-ого числа: ");
		second = LinearTask1.enterNumber("Введите значение 2-ого числа: ");

		countFirst = getCountNumbers(first);
		countSecond = getCountNumbers(second);

		if (countFirst < countSecond) {
			getNumbers(first, second);
		} else {
			getNumbers(second, first);
		}

	}

	public static int getCountNumbers(int a) {
		int count;

		count = 0;

		while (a != 0) {
			a /= 10;
			count++;
		}

		return count;
	}

	public static void getNumbers(int first, int second) {
		int charNumber;
		int tempFirst;
		int tempSecond;
		int cloneSecond;

		tempFirst = Math.abs(first);
		tempSecond = Math.abs(second);
		cloneSecond = tempSecond;

		while (tempFirst != 0) {
			charNumber = tempFirst % 10;

			while (cloneSecond != 0) {
				if ((cloneSecond % 10) == charNumber) {
					System.out.println("Цифра " + charNumber + " присутствует в числах " + first + " и " + second);
					break;
				}
				cloneSecond /= 10;
			}

			tempFirst /= 10;
			cloneSecond = tempSecond;
		}
	}
}
