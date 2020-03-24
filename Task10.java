package com.company.training.cycle;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task10 {
	
	public static void main(String[] args) {
		 
		long result;
		double temp;
		double x;
		
		result = 1;
		x = 1;
		
		while(x < 201) {
			
			temp = Math.pow(x, 2);
			result*= temp;
			x++;
			
		}
		
		System.out.print(result);
	}

}
