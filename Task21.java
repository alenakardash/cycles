package com.company.training.cycle;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, 
 первый столбец которой – значения аргумента, второй - соответствующие значения функции:
 
F(x) = x − sin(x)
*/

public class Task21 {
	
	public static void main(String[] args) {
		
		double a;
		a = 1;
		
		double b;
		b = 3;
		
		double h;
		h = 0.5;
		
		double res;
		
		System.out.printf("%-5s | %-11s%n", "x   ", "y");
		
		for(double x = a; x <= b; x+= h) {
			
			res = x - Math.sin(x);

			
			System.out.printf("%-5s | %-11s%n", x, res);
			
		}
		
		
	}

}
