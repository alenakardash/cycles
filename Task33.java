package com.company.training.cycle;

// Найдите наибольшую цифру данного натурального числа.

public class Task33 {
	
	public static void main(String[] args) {
		
		int n = 39988875;

		int max;
		max = 0;
		
		int digit;
		
		while(n > 0) {
			
			digit = n % 10;
			n/= 10;
			
			if (digit > max) {
				max = digit;
			}
			
			
		}
		
		System.out.print("max = " + max);
	}

}
