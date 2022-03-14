package by.epam.java_introduction.basic;

/*
 * Найти max{min(a, b), min(c, d)}
 */

public class BranchTask2 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int minAB;
		int minCD;
		int max;

		a = LinearTask1.enterNumber("a = ");
		b = LinearTask1.enterNumber("b = ");
		c = LinearTask1.enterNumber("c = ");
		d = LinearTask1.enterNumber("d = ");

		minAB = a < b ? a : b;
		minCD = c < d ? c : d;
		max = minAB > minCD ? minAB : minCD;

		System.out.println("Максимальное число среди минимальных чисел = " + max);

	}

}
