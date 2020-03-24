package com.company.training.cycle;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).

public class Task26 {
	
	public static void main(String[] args) {
		
		char symb;
		
		for (int i = 33; i <= 256; i++) {
			
			System.out.printf("%d  |  ",i);
			
			symb = (char) i;
			
			System.out.println(symb);
			
		}
	}

}
