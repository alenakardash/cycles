package com.company.training.cycle;

/* Вычислить значения функции на отрезке [а,b] c шагом h:
 y = (x + c) * 2 , x = 15
 y = (x - c) + 6, x не равен 15
 */

public class Task8 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int h;
		int x;
		int y;
		
		a = 15;
		b = 20;
		h = 4;
		c = 1;
		
		for (x = a; x <= b; x+= h) {
			System.out.print("x = " + x + " ");
			
			if (x == 15) {
				
				y = (x + c) * 2;
			}
			
			else {
				y = (x - c) + 6;
			}
			
			System.out.println("y = " + y + " ");
		}
	}

}
