package com.company.training.cycle;

/* Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
*/

public class Task38 {
	
	public static void main(String[] args) {
		
		int n;
		n = 86420;
		
		int h;
		h = 0;
		
		int a1;
		int a2;
		
		int digit;
		
		a1 = n % 10;
		
		a2 = n / 10 % 10;
		
		h = a2 - a1;
		
		int temp;
		temp = n / 100;
		
		int check;
		check = 0;
		
		
		while(temp > 0) {
			
			digit = temp % 10;
			
			temp /= 10;
			
			if (digit == a2 + h) {
				
			}
			
			else {
			 check++;
			}
			 a2 = digit;
			
		}
		
		if (check > 0) {
			System.out.print("Не прогрессия");
		}
		else {
			System.out.print("Прогрессия");
		}
		
	}

}
