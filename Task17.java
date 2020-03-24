package com.company.training.cycle;

// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)


public class Task17 {
	
	public static void main(String[] args) {
		
		int n;
		n = 10;
		
		int a;
		a = 1;
		
		int res;
		
		for(int i = 1; i <= n - 1; i++) {
			
			 res = a * (a + i);
			 
			 System.out.println(res);
		}
	}

}
