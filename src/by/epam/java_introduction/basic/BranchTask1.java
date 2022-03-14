package by.epam.java_introduction.basic;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

public class BranchTask1 {
	public static void main(String[] args) {
		int angleX;
		int angleY;
		int summAngles;
		boolean isTriangle;
		boolean isRightTriangle;

		angleX = LinearTask1.enterNumber("Angle x = ");
		angleY = LinearTask1.enterNumber("Angle y = ");

		summAngles = angleX + angleY;

		isTriangle = summAngles < 180;

		if (isTriangle) {

			isRightTriangle = (summAngles == 90) || (angleX == 90) || (angleY == 90);

			if (isRightTriangle) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Треугольник не прямоугольный");
			}

		} else {
			System.out.println("Треугольника с такими углами не существует");
		}

	}

}
