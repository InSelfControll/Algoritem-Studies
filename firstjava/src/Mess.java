import java.util.Random;
import java.util.Scanner;

public class Mess {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] randomcounter = new int[7];
		int[] usernumber = new int[7];
		int counters = 0;
		String[] numbers = "7,37,17,37,28,32".split(",");
		String result = "";
		String rand_num = "";
		for (int i = 0; i < 6; i++) {
			usernumber[i] = Integer.parseInt(numbers[i]);
			randomcounter[i] = rnd.nextInt(37) + 1;
			rand_num += randomcounter[i] + ",";
			for (int j = 0; j < 6; j++) {
				if (usernumber[i] == randomcounter[j]) {
					result += usernumber[i] + " is correct";
					counters++;
				}
			}
			if (result.contains(usernumber[i] + " is correct")) {
				result += "\n";
			} else {
				result += usernumber[i] + "\n";
			}
		}
		System.out.print(result);
		System.out.println("The winning numbers are :" + "\n" + rand_num.substring(0, rand_num.length() - 1));
		System.out.println("You're correct in: " + counters);

	}
}
