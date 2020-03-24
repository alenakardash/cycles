package com.company.training.cycle;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, 
первый столбец которой – значения аргумента, второй - соответствующие значения функции:

F(x)=sin²(x)
*/

public class Task22 {
	
	public static void main(String[] args) {
		
		double a;
		a = 1.5;
		
		double b;
		b = 3;
		
		double h;
		h = 0.5;
		
		double y;
		
		System.out.printf("%-5s | %-11s%n", "x   ", "y");
		
		 for(double x = a; x <= b; x+= h) {
			 
			 y = Math.pow(Math.sin(x), 2);
			 
			 System.out.printf("%-5s | %-11s%n", x, y);
		 }
		
		
	}

}
