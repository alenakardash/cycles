package com.company.training.cycle;

/* Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов
 этой последовательности.
 */

public class Task12 {
	
	public static void main(String[] args) {
		 double a;
		 a = 1;
		 double result;
		 
		 result = 1;
		 
		 for (int i = 0; i < 10; i++) {
			 
			result*= a;
			a = a + 6;
			}
		 System.out.print(result);
		 
	}

}
