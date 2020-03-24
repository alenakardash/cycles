package com.company.training.cycle;

/* С помощью оператора while напишите программу определения суммы всех нечетных чисел в в
 * диапазоне от 1 до 99 включительно.
 */

public class Task5 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int result = 0;
		
		while (x < 100) {
			
			if (!(x % 2 == 0)) {
				result = result + x;

			}
			x++;
			
		}
		System.out.println(result);
	}

}
