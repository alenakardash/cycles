package com.company.training.cycle;

//  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = 6789;
		b = 76;
		
		int temp1;
		int temp2;
		
		int digit1;
		int digit2;
		
		temp1 = a;
		temp2 = b;
		
		System.out.print("цифры числа a: ");
		
		while(temp1 > 0) {
			
			digit1 = temp1 % 10;
			
			temp1 = temp1 / 10; 
			
			System.out.print(digit1 + " ");

			
			
		}
		
		System.out.println("");
		
		System.out.print("цифры числа b: ");
		
           while(temp2 > 0) {
			
			digit2 = temp2 % 10;
			
			temp2 = temp2 / 10; 
			
			System.out.print(digit2 + " ");
			
			
		}
		
	}

}
