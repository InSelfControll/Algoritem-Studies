package com.studies;


public class homework {
	public static void main(String[] args) {
		/* Variables */
			int a = 5;
			int b = 6;
			int c = 7;
			boolean stop = true;
			
			if ( stop && (a >= -10 && b >= 10 && !( c > 40 ) )) {
				System.out.println("all positive");
			} else {
				System.out.println("mixed");
			}
			// Always true
			if ( stop || (a >= -40 && b >= -10 && !( c > -40 ) )) {
				System.out.println("Always true");
			} else {
				System.out.println("mixed");
			}
			
			// Always False
			if ( stop && !(a >= 40 || b >= 10 || !( c > 40 ) )) {
				System.out.println("all positive - False statement");
			} else {
				System.out.println("Always false");
			}
			
			// New int for different if statement
			int x = 2;
			int y = 23;
			
			if (x == y ) {
				System.out.println("Equals");
			}else {
				System.out.println("Not equal");
			}
			
		}
}
