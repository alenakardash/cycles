package com.company.training.cycle;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 Общий член ряда имеет вид:
       1       1
 an = ---- + -----
      2^n     3^n
    
*/

public class Task19 {
	
	public static void main(String[] args) {
	
	int n;
    n = 5;
    
    double e;
    e = 0.00001;
	
	double val;
	double arg1;
	double arg2;
	
	double result;
	result = 0;
	
	for (int i = n; i > 0; i--) {
		
		arg1 = 1 / Math.pow(2, i);
		arg2 = 1 / Math.pow(3, i);
		
		val = arg1 + arg2;
		
		if (Math.abs(val) >= e) {
			
			result+= val;
			}
	}
	
	System.out.print(result);
	
	}
}
