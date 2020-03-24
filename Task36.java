package com.company.training.cycle;

/* Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. 
Найти эти числа.
*/


public class Task36 {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int res;
	
	for (int i = 1001; i < 10000; i++) {
		
		num1 = i % 100;
		
		num2 = i / 100;
		
		res = num1 * num2;
		
		
	    if (res > 0) {
	    	
	    	if (i % res == 0) {
			
			System.out.print("Первое число = " + num1 + " ");
			
			System.out.println("Второе число = " + num2);
			
			System.out.println("");
		}
	    }
	
			
		
	}

 }
}
