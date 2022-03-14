package by.epam.java_introduction.basic;

/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае
 */

public class LinearTask6 {

	public static void main(String[] args) {

		int x;
		int y;
		boolean isInclude;

		x = LinearTask1.enterNumber("x = ");
		y = LinearTask1.enterNumber("y = ");

		isInclude = ((x >= -2 && x <= 2) && (y >= 0 && x <= 4)) || ((x >= -4 && x <= 4) && (y >= -3 && y <= 0));

		System.out.println(isInclude);

	}

}
