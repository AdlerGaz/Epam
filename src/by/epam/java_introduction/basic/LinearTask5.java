package by.epam.java_introduction.basic;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class LinearTask5 {

	public static void main(String[] args) {
		int allSeconds;
		int hours;
		int minutes;
		int seconds;

		allSeconds = LinearTask1.enterNumber("All seconds = ");

		hours = allSeconds / 3600;
		minutes = (allSeconds % 3600) / 60;
		seconds = allSeconds % 3600 % 60;

		System.out.println(hours + "ч " + minutes + "мин " + seconds + "сек");
	}
}
