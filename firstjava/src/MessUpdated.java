import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MessUpdated {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		int[] randomcounter = new int[6];

		int i, j, l;
		int counters = 0;

		
		boolean isSame = true;
		for (j = 0; j < 6; j++) {
			randomcounter[j] = rnd.nextInt(37) + 1;
			while (isSame) {
				isSame = false;
				if (randomcounter[j] == randomcounter[j] && randomcounter[j] == 0) {
					isSame = true;
				}
			}
			System.out.println("Random numbers are: " + randomcounter[j]);
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
	}
}