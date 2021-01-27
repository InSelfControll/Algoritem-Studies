package com.studies;

import java.util.Random;

public class arrays {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] lop = new int[10];
		int[] lop1 = new int[20];
		int i = 0;
		int z = 0 ;

      for (i = 0; i < 10; i++) {
        lop[i] = rand.nextInt(10);
        for (z = 0; z < 20; z++) {
          lop1[z] = rand.nextInt(20);
          System.out.println(lop + "\t" + lop1);
        }
        // Math.max(lop_rabd , lop_rabd1);
      }
	}
}