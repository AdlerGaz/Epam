package by.epam.java_introduction.basic;

/*
 * 	Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *  Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class LinearTask4 {
	
	public static void main(String[] args) {
		
		double r;
		double result;
		
		r = LinearTask2.enterDouble("r = ");
		
		r *= 1000;
		result = r % 1000;
		r = (int) r / 1000;
		result = (result * 1000 + r) / 1000;
		
		System.out.println(result);
	}

}
