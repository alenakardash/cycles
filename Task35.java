package com.company.training.cycle;

// Найдите количество четных цифр данного натурального числа.

public class Task35 {
	
	public static void main(String[] args) {
		
		int n;
		n = 5673;
		
		int temp;
		temp = n;
		
		int digit;
		
		int countChet;
		countChet = 0;
		
		int countNechet;
		countNechet = 0;
		
		
		while(temp > 0) {
			
			digit = temp % 10;
			
			temp/= 10;
			
			if (digit % 2 == 0) {
				
				countChet++;
				
			}
			
			else {
				
				countNechet++;
			}
			
		}
		
		System.out.println("Количество четных цифр числа " + n + " = " + countChet);
		
		System.out.println("Количество нечетных цифр числа " + n + " = " + countNechet);
	}

}
