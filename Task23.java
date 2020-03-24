package com.company.training.cycle;

/*
 Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить
в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:

F(x) = ctg(x/3) + 1/2 sin(x)
 */

public class Task23 {
	
	public static void main(String[] args) {
		
		double a;
		a = 2;
		
		double b;
		b = 3;
		
		double h;
		h = 0.5;
		
		double arg1;
		double arg2;
		double temp;
		
		double y;
		
		System.out.printf("%-5s | %-11s%n", "x   ", "y");
		
		for(double x = a; x <= b; x+= h) {
			
			temp = x / 3;
			
			arg1 = 1 / temp;
			
			arg2 = 0.5 * Math.sin(x);
			
			y = arg1 + arg2;
			
			System.out.printf("%-5s | %-11s%n", x, y);
			
		}
	}

}
