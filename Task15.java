package com.company.training.cycle;

// Вычислить : 1+2+4+8+...+ 2 в 10 степени.

public class Task15 {
	
	public static void main(String[] args) {
		
		int number;
		number = 2;
		
        int pow;
        pow = 0;
        
        double temp;
        
        double result;
        result = 0;
        
        
        for(int i = 0; i < 11; i++) {
        	
        	temp = Math.pow(number, pow);
        	
        	result+= temp;
        	
        	pow++;
        }
         
        System.out.print(result);
         
		
		
	}

}
