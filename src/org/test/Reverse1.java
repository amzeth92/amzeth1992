package org.test;

public class Reverse1 {
	
	public static void main(String[] args) {
		int a=786, i=0, j=0;
		
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
		System.out.println(j);
	}

}
