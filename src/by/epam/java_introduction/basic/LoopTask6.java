package by.epam.java_introduction.basic;

/*
 * Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.
 */

public class LoopTask6 {
	public static void main(String[] args) {
		char ch;

		for (int i = 33; i <= 127; i++) {
			ch = (char) i;
			System.out.println(i + " - " + ch);
		}

	}
}
