package com.company.training.cycle;

/*
Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А, затем В. 
Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
на 99, а второе на 49.
 */

public class Task37 {
	
	public static void main(String[] args) {
		
		int ab;
		int cd;
		
		int cdab;
		
		
		for (int i = 1001; i < 10000; i++) {
			
			if (i % 99 == 0) {
				
				ab = i / 100;
				
				cd = i % 100;
				
				cdab = cd * 100 + ab;
				
				if (cdab % 49 == 0) {
					
					System.out.println("Число А = " + ab);
					
					System.out.println("Число B = " + cd);
				}
				
			}
			
			
			
			
		}
	}

}
