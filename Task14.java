package com.company.training.cycle;

// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {
	
	public static void main(String[] args) {
		
		double n;
		n = 10;
		
		double res;
		
		res = 0;
		
		double div;
		
		div = 1;
		
		double temp;
		
		
		
		for(int i = 0; i < n; i++) {
			
			temp = 1 / div;
			res = res + temp;
			
			div++;
		}
		
		System.out.print(res);
	}

}
