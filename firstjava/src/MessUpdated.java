import java.util.List;
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

		do {
			// isSame = false;
			for (j = 0; j < 6; j++) {
				randomcounter[j] = rnd.nextInt(37) + 1;
				// Print the random numbers for testing if there is something twice
				System.out.println("Random numbers are: " + randomcounter[j]);
				// isSame = false;
				for (l = 0; l < 6; l++) {
					randomcounter[j] = randomcounter[l];
					if (randomcounter[j] == randomcounter[l]) {
						isSame = true;
						randomcounter[j] = rnd.nextInt(37) + 1;
					}
					if (randomcounter[l] == 0) {
						isSame = true;
						randomcounter[j] = rnd.nextInt(37) + 1;
					}
				}
			}
		} while (l < 6 && isSame);

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