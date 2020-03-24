package com.company.training.cycle;

/* В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. 
Найти это число.
*/

public class Task39 {
	
	public static void main(String[] args) {
		
		int temp;
		
		for(int i =101; i < 1000; i++) {
			
			temp = i % 100;
			
			if (temp * 7 == i) {
				
				System.out.println("Искомое число = " + i);
			}
			
		}
	}

}
