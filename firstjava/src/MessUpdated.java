import java.util.Random;
import java.util.Scanner;

public class MessUpdated {

	public static void main(String[] args) {
		lotto();
	}

	public static boolean lotto() {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		int[] randomcounter = new int[6];

		int i;
		int l = 0, j = 0;
		int counters = 0;

		boolean isSame = true;
		/*
		 * for (j = 0; j < 6; j++) { randomcounter[j] = rnd.nextInt(37) + 1; // Print
		 * the random numbers for testing if there is something twice
		 * System.out.println("Random numbers are: " + randomcounter[j]); }
		 */

		// isSame = false;
		// isSame = false;
		while (isSame) {
			isSame = false;
			for (j = 0; j < 6; j++) {
				randomcounter[j] = rnd.nextInt(37) + 1;
				// Print the random numbers for testing if there is something twice
				System.out.println("Random numbers are: " + randomcounter[j]);
				if (randomcounter[j] == randomcounter[j]) {
					randomcounter[j] = rnd.nextInt(37) + 1;
				}else {
					randomcounter[j] = rnd.nextInt(37) + 1;
					continue;
				}
				if (randomcounter[j] == 0) {
					randomcounter[j] = rnd.nextInt(37) + 1;
				}else {
					randomcounter[j] = rnd.nextInt(37) + 1;
					continue;
				}
				randomcounter[j] = rnd.nextInt(37) + 1;
				continue;
			}
		}
		for (i = 0; i < 6; i++) {
			usernumber[i] = userinput.nextInt();
			for (j = 0; j < 6; j++) {
				if (usernumber[i] == randomcounter[j]) {
					counters++;
				} else {
				}
			}
			if (usernumber[i] == usernumber[i]) {

			}
		}
		System.out.println("You're correct in: " + counters);
		System.out.println("\n");
		for (j = 0; j < 6; j++) {
			System.out.println("Random numbers are: " + randomcounter[j]);
		}
		return false;
	}
}