package com.company.training.cycle;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа 

public class Task6 {
	
	public static void main(String[] args) {
		
		int a;
		a = 3;
		
		int temp;
		temp = 0;
		
		int sum;
		sum = 0;
		
		for(int i = 0; i < a; i++) {
			
			temp++;
			
			sum += temp;
			
		}
		System.out.println(sum);
		 
		
		
	}

}
