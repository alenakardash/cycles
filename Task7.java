package com.company.training.cycle;

/* Вычислить значения функции на отрезке [а,b] c шагом h:
y = ｛ x, x > 2
y = ｛- x, x <= 2
 */


public class Task7 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int h;
		int x;
		int y;
		
		a = 1;
		b = 5;
		h = 1;
		
		for(x = a; x <= b; x+= h) {
			
			System.out.print("x = " + x + " ");
			
			if (x > 2) {
				y = x;
			}
			else {
				y = -x;
			}
			
			System.out.println("y = " + y);
		  }
		}

	}