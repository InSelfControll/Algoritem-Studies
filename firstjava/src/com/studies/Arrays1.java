package com.studies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arrays1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] I1 = new int[10];
		int[] Z1 = new int[20];

		int i = 0;
			I1[10] = rand.nextInt(10);
		int z = 0 ;
			Z1[20] = rand.nextInt(20);
		
		int[] I = ForZ(I1);
		int[] Z = ForI(Z1);
		
		
		System.out.println("Max: " + "\n");
		System.out.println(Math.max(I1, Z1));
	}

	public static int[] ForI(int[] I1) {
		Random rand = new Random();

		int[] lop = new int[10];
		int i;
		System.out.println("First Array! ");
		for (i = 0; i < I1.length; i++) {
			I1[10] = rand.nextInt(10) + 1;
			System.out.println(I1[i]);
		}
		return lop;

	}

	public static int[] ForZ(int[] Z1) {
		Random rand = new Random();

		int[] lop1 = new int[20];
		int z;

		System.out.println("\n");
		System.out.println("Second Array! ");
		for (z = 0; z < Z1.length; z++) {
			Z1[20] = rand.nextInt(20);
			System.out.println(Z1[z]);
		}
		return lop1;
	}
}
