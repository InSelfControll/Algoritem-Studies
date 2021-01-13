package com.studies;

import java.util.*;

public class m {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		/*robots.aaa(20, 60);*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n Start of Multi / Sum exercise: ");
		int x = scan.nextInt();
		int z = scan.nextInt();
		int s = scan.nextInt();
		int a = scan.nextInt();
		
		int sum= x + a +s +z;
		int multi=x*z*s*a;
		
		
		System.out.println(" x * z * s * a: " + multi);
		System.out.println(" x + z + s + a: " + sum);
		if (x > z || s > a) {
			System.out.println(" x is bigger than z: " + x);
		}else if (x < z) {
			System.out.println(" z is bigger than x: " + z);
		}else {
			System.out.println(" z is equals x: " + z + x);
		}
		
		System.out.println("\n Start of robot sum: ");
		robots.MaxandSumCheck();
	}
	
}
