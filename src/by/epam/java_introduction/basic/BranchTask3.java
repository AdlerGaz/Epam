package by.epam.java_introduction.basic;

/*
 *  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class BranchTask3 {
	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		boolean isLine;

		System.out.println(Math.sqrt(45));

		x1 = LinearTask1.enterNumber("x1 = ");
		y1 = LinearTask1.enterNumber("y1 = ");
		x2 = LinearTask1.enterNumber("x2 = ");
		y2 = LinearTask1.enterNumber("y2 = ");
		x3 = LinearTask1.enterNumber("x3 = ");
		y3 = LinearTask1.enterNumber("y3 = ");

		isLine = (y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2);

		if (isLine) {
			System.out.println("Точки расположены на одной линии");
		} else {
			System.out.println("Точки не расположены на одной линии");
		}

	}
}
