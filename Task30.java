package com.company.training.cycle;

import java.util.Scanner;

// Написать программу, переводящую римские цифры в арабские.

public class Task30 {
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите римскую цифру: ");
		
		String symb = sc.nextLine();
		
		switch(symb) {
		
		case "I":
			System.out.println(1);
			break;
		case "IV":
			System.out.println(4);
			break;
		case "V":
			System.out.println(5);
			break;
		case "IX":
			System.out.println(9);
			break;
		case "X":
			System.out.println(10);
			break;
		case "L":
			System.out.println(50);
			break;
		case "C":
			System.out.println(100);
			break;
		case "D":
			System.out.println(500);
			break;
		case "M":
			System.out.println(1000);
			break;
		default:
			System.out.println("Нет такой римской цифры");
		}
			
	}

}
