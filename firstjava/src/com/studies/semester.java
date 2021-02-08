package com.studies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class semester {

	public static int totalStudents = 2;
	public static int eachArraySize = 6;
	public static int eachArrayGuess = 7;

	public static void main(String[] args) throws InterruptedException {
		Integer[] lotteryNumbers = null;
		Map<String, Integer[][]> studentData = null;
		Map<String, Integer> result = null;
		while (true) {
			lotteryNumbers = generateLotteryNumbers(10);
			studentData = generateStudentData();
			result = getLotteryResult(lotteryNumbers, studentData);
			printResults(result);
			waitforHours(2);
		}
	}

	private static void waitforHours(int hours) throws InterruptedException {
		System.out.println("Going to wait for " + hours + " hours");
		TimeUnit.HOURS.sleep(hours);
	}

	private static void printResults(Map<String, Integer> result) {

		List<String> names = null;
		int maxCorrect = 0;
		names = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			if (entry.getValue() > maxCorrect) {
				maxCorrect = entry.getValue();
				names.clear();
				names.add(entry.getKey());
			} else if (entry.getValue() == maxCorrect) {
				names.add(entry.getKey());
			}
			System.out.println(entry.getKey() + " has correct answers = " + entry.getValue());
		}
		if (maxCorrect > 0 && null != names && names.size() > 0) {
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i) + " has scored maximum correct answers = " + maxCorrect);
			}
		} else {
			System.out.println("No one won any lottery...");
		}
	}

	private static Map<String, Integer> getLotteryResult(Integer[] lotteryNumbers, Map<String, Integer[][]> studentData) {
		Map<String, Integer> result = null;
		Integer[][] studentGuess = null;
		int correctGuess = 0;
		int eachStudentTotalCorrect = 0;
		result = new ConcurrentHashMap<String, Integer>();
		for (Map.Entry<String, Integer[][]> entry : studentData.entrySet()) {
			studentGuess = entry.getValue();

			for (int i = 0; i < eachArraySize; i++) {
				eachStudentTotalCorrect = 0;
				correctGuess = 0;
				for (int j = 0; j < eachArrayGuess; j++) {
					if (isNumberCorrect(studentGuess[i][j], lotteryNumbers)) {
						correctGuess++;
					}
				}
				if (correctGuess >= 4) {
					if (null != result.get(entry.getKey())) {
						eachStudentTotalCorrect = result.get(entry.getKey());
						result.put(entry.getKey(), ++eachStudentTotalCorrect);
					} else {
						result.put(entry.getKey(), 1);
					}
				} else {
					result.put(entry.getKey(), 0);
				}
			}
		}
		return result;
	}

	private static Map<String, Integer[][]> generateStudentData() {
		Map<String, Integer[][]> studentData = null;
		int count = 0;
		String name = null;
		Integer[][] numbers = null;
		Scanner sc = new Scanner(System.in);
		studentData = new ConcurrentHashMap<String, Integer[][]>();
		while (count < totalStudents) {
			System.out.println("Enter student name...");
			name = sc.next();
			if (null == studentData.get(name)) {
				count++;
				numbers = new Integer[eachArraySize][eachArrayGuess];
				for (int i = 0; i < eachArraySize; i++) {
					numbers[i] = getLotteryNumbersFromUser(eachArrayGuess, sc);
				}
				studentData.put(name, numbers);
			} else {
				System.out.println("Student already exists, re-enter other name");
			}
		}

		if (null != sc) {
			sc.close();
		}
		return studentData;
	}

	private static Integer[] generateLotteryNumbers(int size) {
		Integer[] lotteryNumbers = new Integer[size];
		Set<Integer> values = new HashSet<>();
		int number = 0;
		for (int i = 0; i < size; i++) {
			number = generateRandomNumber();
			while (values.contains(number)) {
				number = generateRandomNumber();
			}
			lotteryNumbers[i] = number;
		}
		return lotteryNumbers;
	}

	private static Integer[] getLotteryNumbersFromUser(int size, Scanner sc) {
		Integer[] lotteryNumbers = new Integer[size];
		String arrayData = null;
		String[] tempData = null;
		System.out.println("Enter array data: e.g [1,2,3,4,5,6,7]");
		arrayData = sc.next();
		arrayData = arrayData.replace("[", "");
		arrayData = arrayData.replace("]", "");
		tempData = arrayData.split(",");
		for (int i = 0; i < 7; i++) {
			lotteryNumbers[i] = Integer.parseInt(tempData[i]);
		}
		return lotteryNumbers;
	}

	private static int generateRandomNumber() {
		return new Random().nextInt(41 - 1) + 1;
	}

	private static boolean isNumberCorrect(Integer number, Integer[] lotteryNumbers) {
		for (int i = 0; i < lotteryNumbers.length; i++) {
			if (number == lotteryNumbers[i]) {
				return true;
			}
		}
		return false;
	}

}