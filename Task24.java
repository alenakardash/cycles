package com.company.training.cycle;

/* Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
 его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
 числом.
*/

public class Task24 {
	
	public static void main(String[] args) {
		
		int num;
		num = 456;
	
		int newNumber;
		newNumber = 0;
		
		int sum;
		sum = 0;
		
		int temp;
	    temp = num;
	    
	    int digit;
	    
	    
	    while (temp > 0) {
		
		digit = temp % 10;
		
		temp/= 10;
		
		newNumber = newNumber * 10 + digit;
		
		
		if (digit % 2 == 0) {
			
		   sum+= digit;
		}
	
	    }
	    System.out.println("sum = " + sum);
	    System.out.println("newnumber = " + newNumber);
	    
	    
	}

}
