import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MessUpdated {

	public static void main(String[] args) {
		lotto();
	}

	@SuppressWarnings("unlikely-arg-type")
	public static int lotto() {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		int[] randomcounter = new int[6];
		Set<Integer> rnd1 = new HashSet<Integer>();

		int i;
		int l = 0, j = 0;
		int counters = 0;

		boolean isSame = true;
		/*
		 * for (j = 0; j < 6; j++) { randomcounter[j] = rnd.nextInt(37) + 1; // Print
		 * the random numbers for testing if there is something twice
		 * System.out.println("Random numbers are: " + randomcounter[j]); }
		 */

		for (j = 0; j < randomcounter.length; j++) {
			randomcounter[j] = rnd.nextInt(37) + 1;
			// Print the random numbers for testing if there is something twice
			System.out.println("Random numbers are: " + randomcounter[j]);
			while (isSame && j < randomcounter.length) {
				if (randomcounter.equals(randomcounter)) {
					randomcounter[j]++;
					//isSame =  true;
				}
				if (randomcounter.equals(0) ) {
					randomcounter[j]++;
					continue;
				}
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
		return 0;
	}
}