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
		int z = 0;
		I1[i] = rand.nextInt(10);
		Z1[z] = rand.nextInt(20);

		int I = ForI(I1, i);
		int Z = ForZ(Z1, z);

		System.out.println("Max: " + "\n");
		System.out.println(Math.max(I, Z));
		
		System.out.println("First Array! ");
		for (i = 0; i < I1.length; i++) {
			I1[i] = rand.nextInt(10) + 1;
			System.out.println(I1[i]);
		}
		System.out.println("\n");
		System.out.println("Second Array! ");
		for (z = 0; z < Z1.length; z++) {
			Z1[z] = rand.nextInt(20);
			System.out.println(Z1[z]);
		}
	}

	public static int ForI(int[] I1, int i) {
		Random rand = new Random();

		// int[] lop = new int[10];
		System.out.println("First Array! ");
		for (i = 0; i < I1.length; i++) {
			I1[i] = rand.nextInt(10) + 1;
			System.out.println(I1[i]);
		}
		return i++;

	}

	public static int ForZ(int[] Z1, int z) {
		Random rand = new Random();

		// int[] lop1 = new int[20];

		System.out.println("\n");
		System.out.println("Second Array! ");
		for (z = 0; z < Z1.length; z++) {
			Z1[z] = rand.nextInt(20);
			System.out.println(Z1[z]);
		}
		return z++;
	}
}
