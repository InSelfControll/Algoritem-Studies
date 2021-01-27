package com.studies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arrays1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int I1 = rand.nextInt(10);
		int Z1 = rand.nextInt(20);

		int[] I = ForI(I1);
		int[] Z = ForZ(Z1);
		
		
		System.out.println("Max: " + "\n");
		System.out.println(Math.max(I1, Z1));
	}

	public static int[] ForI(int I1) {
		Random rand = new Random();

		int[] lop = new int[10];
		int i;
		System.out.println("First Array! ");
		for (i = 0; i < lop.length; i++) {
			//lop[i] = rand.nextInt(10) + 1;
			System.out.println(lop[i]);
		}
		return lop;
		 
	}
	public static int[] ForZ(int Z1) {
		Random rand = new Random();

		int[] lop1 = new int[20];
		int z;

		System.out.println("\n");
		System.out.println("Second Array! ");
		for (z = 0; z < lop1.length; z++) {
			//lop1[z] = rand.nextInt(20);
			System.out.println(lop1[z]);
		}
		return lop1;
	}
}
