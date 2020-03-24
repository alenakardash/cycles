package com.company.training.cycle;

// Найти сумму квадратов первых ста чисел.

public class Task9 {
	
	public static void main(String[] args) {
		
		double temp;
		double res;
		
		temp = 0;
		res = 0;
		
		for(int x = 1; x < 101; x++) {
			
			temp = Math.pow(x, 2);
			res+= temp;
			
		}
		System.out.print(res);
		
		
	}

}
