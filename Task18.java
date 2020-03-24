package com.company.training.cycle;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
Общий член ряда имеет вид:

          (-1)^n-1
   an =   --------
              n
*/

public class Task18 {
	
	public static void main(String[] args) {
		
		int n;
		
		n = 5;
		
		double e = 0.0001;
		
		double value;
		
		double res;
		
		res = 0;
		
		for(int i = n; i > 0; i--) {
			
			value = (Math.pow(-1, i - 1)) / i;
			
			if (Math.abs(value) >= e) {
				
				res+= value;
	
			}
		}
		System.out.print(res);
	}

}
