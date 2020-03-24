package com.company.training.cycle;

import java.util.Scanner;

/*
Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы и знак
подчеркивания. Остальные символы могут быть буквами, цифрами и знаком подчеркивания
*/

public class Task32 {
	
	public static void main(String[] args) {
		
		 String input;
		 
		 boolean isOK;
		 isOK = true;
		 
		 @SuppressWarnings("resource")
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Введите строку: ");
		 
		 
		 while(!sc.hasNextLine()) {
			 
			 System.out.println("Некорректный ввод. Допустима только строка. Введите строку: ");
			 
			 sc.next();
		 }
		 
		 input = sc.nextLine();
		 
		 char [] masChars = input.toCharArray();
		 
			 
			 if(Character.isLetter(masChars[0]) || (masChars[0] == '_')) {
				 
				 for (int i = 1; i < masChars.length - 1; i++) {
					 
					 if(Character.isLetter(masChars[i]) || Character.isDigit(masChars[i]) || masChars[i] == '_') {
					
						 
					 }
					 
					 else {
						 isOK = false;
					 }
					 
				 }
				 
				
				if (isOK) {
					
					System.out.println("Валидация прошла успешно");
				}
				
				else {
					System.out.println("Ввод некорректный");
				}
				
				
			 }
			 else {
					System.out.println("Ввод некорректный");
				}
		 }
		 
		 
		 
	}



