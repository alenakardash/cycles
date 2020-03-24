package com.company.training.cycle;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
Общий член ряда имеет вид:

an= 1 /(3n−2)(3n+1)
*/

public class Task20 {
	
	public static void main(String[] args) {
		
		int n;
		n = 5;
		
		double e;
		e = 0.001;
		
		double val;
		double temp;
		
		double res;
		res = 0;
		
		
		for(int i = n; i > 0; i--) {
			
			temp = (3 * i - 2) * (3 * i + 1);
			
			val = 1 / temp;
			 
			if (Math.abs(val) >= e) {
				
				res+= val;
				
			} 
		}
		System.out.print(res);
	}

}
