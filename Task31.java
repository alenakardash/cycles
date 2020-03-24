package com.company.training.cycle;

import java.util.Random;

import java.util.Scanner;

/*
 Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
 угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
 программа, а также ошибочные числа пользователя.
 */

public class Task31 {
	
	public static void main(String[] args) {
		
		int min = 1;
		int max = 15;
		int diff = max - min;
		
		Random random = new Random();
		
		int count;
		count = 0;
		
		int [] array = new int[5];
		
		System.out.println("Компьютер загадал числа: ");
		
		for (int i = 0; i < array.length; i++) {
		
		array[i] = random.nextInt(diff + 1);
		
		System.out.println(array[i] + " ");
		
		}
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] guess = new int[5];
		
		System.out.println("Попробуйте угадать число, которое загадал компьютер. Введите число от 1 до 15");
		
		
		for(int j = 0; j < 5; j++) {
			
			System.out.println("Попытка № " + (j+1));
			
			while(!sc.hasNextInt()) {
				
				System.out.println("Вы ввели не целое число. Попробуйте еще раз. Введите число от 1 до 15: ");
				
				sc.next();
			}
			
			guess[j] = sc.nextInt();
			
		}
		
		
		for (int k = 0; k < array.length; k++) {
			
			
			if (array[k] == guess[0] || array[k] == guess[1] || array[k] == guess[2] || array[k] == guess[3] || array[k] == guess[4]) {
					
					System.out.println("Поздравляем! Вы угадали число " + array[k]);
					
					count++;
				}
				else {
					System.out.println("Вы  не угадали число " + array[k]);
					
				}
			} 
		
		
		if (count == 0) {
			
			System.out.print("Вы не угадали ни одного числа");
		}
		
		
		}

}
