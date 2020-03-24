package com.company.training.cycle;

// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {
	
	public static void main(String[] args) {
		
		int sum;
		sum = 0;
		
		int digit;
		int temp;
		
		for(int i = 1000; i < 10000; i++) {
			
			temp = i;
			
			while(temp > 0) {
				
				digit = temp % 10;
				sum+= digit;
				temp/= 10;
				

				}
			
			if (sum == 15) {
				
				System.out.println(i);
			}
			
			else {
				sum = 0;
				}
		}
	}

}
