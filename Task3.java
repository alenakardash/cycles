package com.company.training.cycle;

// Необходимо вывести на экран таблицу умножения на 3

public class Task3 {
	
	public static void main(String[] args) {
		
		int x;
		
		x = 0;
		
		for(int i = 0; i < 11; i++) {
			
			x = 3 * i;
			
			System.out.println(3 +  " * " + i + " = " + x);
		}
		
	}

}
