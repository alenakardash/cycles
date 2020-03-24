package com.company.training.cycle;

// Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

public class Task40 {
	
	public static void main(String[] args) {
		
		int n;
		n = 232;
		
		int temp;
		int digit;
		int count;
		
		count = 0;
		
		
       for (int i = 1; i < n; i++) {
    	   
    	   temp = i;
    	   
    	   while(temp > 0) {
    		   
    		   digit = temp % 10;
    		   
    		   temp/= 10;
    		   
    		   if (digit != 0) {
    		   
    		   if (i % digit != 0) {
    			   count++;
    		   }
    		   else {}
    	   }
    		   else {}
    	   }
    	  
    	   
    	   if (count == 0) {
    		   
    		   System.out.print(i + " ");
    	   }
    	   
    	   else {
    		   count = 0;
    	   }
    	   
    	   
    	   
       }
	}

}
