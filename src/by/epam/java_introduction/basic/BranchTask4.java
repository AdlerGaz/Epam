package by.epam.java_introduction.basic;

/*
 *  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class BranchTask4 {
	public static void main(String[] args) {
		int holeSideA;
		int holeSideB;
		int brickSideX;
		int brickSideY;
		int brickSideZ;
		boolean isPass;

		holeSideA = LinearTask1.enterNumber("Введите 1-ую сторону отверстия: ");
		holeSideB = LinearTask1.enterNumber("Введите 2-ую сторону отверстия: ");
		brickSideX = LinearTask1.enterNumber("Введите длину кирпича: ");
		brickSideY = LinearTask1.enterNumber("Введите ширину кирпича: ");
		brickSideZ = LinearTask1.enterNumber("Введите высоту кирпича: ");

		isPass = ((holeSideA >= brickSideX) || (holeSideA >= brickSideY) || (holeSideA >= brickSideZ))
				 && ((holeSideB >= brickSideX) || (holeSideB >= brickSideY) || (holeSideB >= brickSideZ));

		if (isPass) {
			System.out.println("Кирпич с данными значениями пройдет в отверстие :)");
		} else {
			System.out.println("Кирпич с данными значениями не пройдет в отверстие :(");
		}

	}
}
