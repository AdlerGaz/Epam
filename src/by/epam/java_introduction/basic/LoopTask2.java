package by.epam.java_introduction.basic;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h.
 * y = x, x > 2
 * y = -x, x <=2
 */

public class LoopTask2 {
	public static void main(String[] args) {
		int a;
		int b;
		int h;

		a = LinearTask1.enterNumber("Введите точку a: ");
		b = LinearTask1.enterNumber("Введите точку b: ");
		h = LinearTask1.enterNumber("Введите шаг h: ");

		if (a < b) {
			resultFunction(a, b, h);
		} else {
			resultFunction(b, a, h);
		}

	}

	public static void resultFunction(int a, int b, int h) {
		int result = 0;

		for (int i = a; i <= b; i += h) {
			if (i > 2) {
				result = i;
				System.out.println("Значение функции в точке: " + i + " равняется: " + result);
			} else {
				result = -i;
				System.out.println("Значение функции в точке: " + i + " равняется: " + result);
			}
		}

	}
}
