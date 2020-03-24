package com.company.training.cycle;

import java.util.Scanner;

// Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое число: ");
		
		while(!sc.hasNextInt()) {
			
			System.out.println("Ввод не корректный. Введите целое число");
			
			sc.next();
		}
		
		int number = sc.nextInt();

		
		int factorial;
		
		factorial = 1;
		
		for(int i = 1; i <= number; i++) {
			
			factorial*= i;
			
		}
		
		System.out.print("Факториал введенного числа " + number + " = " + factorial);
		
		
	}

}
