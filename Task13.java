package com.company.training.cycle;

// Составить таблицу значений функции y = 5 - x²/2 на отрезке [-5; 5] с шагом 0.5.

public class Task13 {
	
	public static void main(String[] args) {

		 double x;
		 double y;
		 double finish;
		 double h;
		 
		 x = -5;
		 finish = 5;
		 h = 0.5;
		 
		 System.out.println("  x   |   y");
		 
		 while(x <= finish) {
			 
			 System.out.format("%-5s | ", x);
			 
			 y = 5 - (Math.pow(x, 2) / 2);
			 
			 System.out.println(y);
			 
			 x+= h;
		 }
		 
		 
	}

}
