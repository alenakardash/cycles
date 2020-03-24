package com.company.training.cycle;

// Составить программу нахождения разности кубов первых двухсот чисел


public class Task11 {
	
	public static void main(String[] args) {
		
		double temp;
		double result;
		
		result = 1;
		
		for(int x = 2; x < 201; x++) {
			
			temp = Math.pow(x, 3);
			result = result - temp;
			
		}
		System.out.print(result);
	}

}
