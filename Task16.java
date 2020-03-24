package com.company.training.cycle;

// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {
	
	public static void main(String[] args) {
		
		int a;
		a = 1;
		
		long res;
		res = 1;
		
		int sum;
		sum = 1;
	
			
			for(int i = 0; i < 9; i++) {
				
				sum = sum + (a + 1);
				
				a++;
				
				res *= sum;
		}
			
			System.out.print(res);
		
	}

}
