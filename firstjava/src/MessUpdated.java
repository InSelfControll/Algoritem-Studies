import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MessUpdated {

	public static void main(String[] args) {
		lotto();
	}

	public static int lotto() {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		// int[] randomcounter = new int[6];
		List<Integer> randomcounter = new ArrayList<Integer>();

		int i = 0;
		int j = 0;
		int counters = 0;

		while (randomcounter.size() < 6) {
			int number = rnd.nextInt(37) + 1;
			if (!randomcounter.contains(number)) {
				randomcounter.add(number);
			}
		}

		for (i = 0; i < 6; i++) {
			usernumber[i] = userinput.nextInt();
			for (j = 0; j < 6; j++) {
				if (usernumber[i] == randomcounter.get(i)) {
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
			System.out.println("Random numbers are: " + randomcounter.get(j));
		}
		return 0;
	}

}