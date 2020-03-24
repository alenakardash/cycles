package com.company.training.cycle;

import java.util.Scanner;

/*
Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить результат Z в зависимости от знака.
Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении. Организовать возможность многократных 
вычислений без перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.
 */

public class Task28 {
	
	public static void main(String[] args) {
		
		double result;
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		
		System.out.println("Введите знак арифметической операции: ");
		
		
		if (sc.hasNextInt()) {
			
			int check = sc.nextInt();
			
			if(check == 0) {
				
				System.out.println("Bye bye");
				
				System.exit(0);

			}
			
			else {}
		}
		
		
		
		char c = sc.next().charAt(0);
		
		
		while (!(c == '/'|| c == '*' || c == '+' || c == '-')) {
			
			System.out.println("Неверный знак арифметической операции. Введите + или - или / или * : ");
			
			c = sc.next().charAt(0);
		
		}
		@SuppressWarnings("resource")	
		Scanner num1 = new Scanner(System.in);
		
		@SuppressWarnings("resource")
		Scanner num2 = new Scanner(System.in);
		
	    System.out.println("Введите число (первый аргумент): ");
	    
	    while(!num1.hasNextDouble()) {
	    	
	    	System.out.println("Вы ввели не число. Введите число: ");
	    	
	    	num1.next();
	    } 
		
	    double arg1 = num1.nextDouble(); 
	    
        System.out.println("Введите число (второй аргумент): ");
	    
	    while(!num2.hasNextDouble()) {
	    	
	    	System.out.println("Вы ввели не число. Введите число: ");
	    	
	    	num2.next();
	    } 
	    
	    double arg2 = num2.nextDouble();
	    
	    if (c == '*') {
	    	
	    	result = arg1 * arg2;
	    }
	    
	    else if (c == '+') {
	    	
	    	result = arg1 + arg2;
	    	
	    }
	    
        else if (c == '-') {
	    	
	    	result = arg1 - arg2;
	    	
	    }
	    
        else {
        	
        	if (arg2 == 0) {
        		
        		System.out.println("На ноль делить нельзя!");
        		
        		continue;
        		
        	}
        	
        	else {
        	
        	result = arg1 / arg2; 
        	}
        	
        	
        }
		
	    System.out.println("result = " + result);
		
		}
	    
		}    

      }
	
	
	    



