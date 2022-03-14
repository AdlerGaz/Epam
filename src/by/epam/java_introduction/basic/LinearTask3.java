package by.epam.java_introduction.basic;

/*
 *  Вычислить значение выражения по формуле
 *  (sin x + cos y) / (cos x - sin y) * tg x * y
 *  (все переменные принимают действительные значения).
 */

public class LinearTask3 {

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = LinearTask2.enterDouble("x = ");
		y = LinearTask2.enterDouble("y = ");

		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
		result *= Math.tan(x * y);

		System.out.println(result);

	}
}
