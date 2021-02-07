package com.studies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class semester {


	public static void main(String[] args) {

		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(11);

		System.out.println("Please write 4 names: ");
		//name(name);

		lotto();
	}

	public static void name(String name) {
		Scanner username = new Scanner(System.in);
		String[] name1 = new String[10];
		int x = 0;

		for (x = 0 ; x < 10 ; x++) {
			name1[x] = username.nextLine();
		}
		
		for (x = 0; x < 4; x++) {
			name = username.nextLine();
			if (name.length() < 2) {
				System.out.println("Please enter name with 2 letters or more ! ");
			}

		}
		/*
		 * while (x < 4) { String name = username.nextLine(); if (name.length() < 2) {
		 * System.out.println("Please write your name:" + username); } x++;
		 * 
		 * }
		 */

	}

	public static int lotto() {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[10];
		// int[] randomcounter = new int[6];
		List<Integer> randomcounter = new ArrayList<Integer>();

		int i = 0;
		int j = 0;
		int counters = 0;
		int flight = 0;

		
		Scanner username = new Scanner(System.in);
		String[] name1 = new String[2];
		int x = 0;
		
		
		for (x = 0 ; x < name1.length ; x++) {
			name1[x] = username.nextLine();
			String fcapl = name1[x].substring(0,1).toUpperCase() + name1[x].substring(1);
			//System.out.println(fcapl);
		}
		
		System.out.println("\n");
		System.out.println("Write random number between 1 to 40!");
		while (randomcounter.size() < 10) {
			int number = rnd.nextInt(40) + 1;
			if (!randomcounter.contains(number)) {
				randomcounter.add(number);
			}
		}

		// First print all random number after generated for cehck for duplications
		/*
		 * for (j = 0; j < 6; j++) { System.out.println("Random numbers are: " +
		 * randomcounter.get(j)); }
		 */

		for (i = 0; i < 10; i++) {
			usernumber[i] = userinput.nextInt();
			for (j = 0; j < 10; j++) {
				if (usernumber[i] == randomcounter.get(j)) {
					counters++;
				} else {
				}
			}
			if (usernumber[i] == usernumber[i]) {

			}
		}
		if (counters >= 1) {
			flight++;
			for (x = 0 ; x < name1.length ; x++) {
				String fcapl = name1[x].substring(0,1).toUpperCase() + name1[x].substring(1);
				System.out.println( fcapl + " You won " + flight + " tickets!");
			}
			
		} else {
			System.out.println("You lost ");
		}

		System.out.println("\n");
		for (j = 0; j < 10; j++) {
			System.out.println("The winning numbers are " + randomcounter.get(j));
		}
		
		//System.out.println("The winner is: " + name1[0]);
		return 0;
	}

}