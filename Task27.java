package com.company.training.cycle;

import java.util.Scanner;

/*  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
m и n вводятся с клавиатуры.
*/
public class Task27 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Введите первое натуральное число: ");
		
		 while(!sc1.hasNextInt()) {
			 
			 System.out.println("Вы ввели не натуральное число. Введите число: ");
			 
			 sc1.next();
		 }
		 
		 int num1 = sc1.nextInt();
		 
			
			System.out.println("Введите второе натуральное число: ");
			
			 while(!sc2.hasNextInt()) {
				 
				 System.out.println("Вы ввели не натуральное число. Введите число: ");
				 
				 sc2.next();
			 }
			 
			 int num2 = sc2.nextInt();
			 
			 
			  for (int i = num1; i <= num2; i++) {
				  
				  System.out.print("Делители числа " + i + ": ");
				  
				  for (int j = 2; j < i; j++) {
					  
					  if (i % j == 0) {
						  System.out.print(j + " ");
					  }
				  }
				  
				  System.out.println("");
			  }
		 
		
		
	}
	
	

}
