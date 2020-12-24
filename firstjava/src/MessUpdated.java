import java.util.Random;
import java.util.Scanner;

public class MessUpdated {

	public static void main(String[] args) {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		int[] randomcounter = new int[6];

		int i,j,l;
		int counters = 0;

		for (i = 0; i < 6; i++) {
			usernumber[i] = userinput.nextInt();
			for (j = 0; j < 6; j++) {
				randomcounter[j] = rnd.nextInt(37) + 1;
				if (usernumber[i] == randomcounter[j]) {
					counters++;
				}
			}
		}
		System.out.println("You're correct in: " + counters);
		for (l = 0; l < 6; l++) {
			randomcounter[l] = rnd.nextInt(37) + 1;
		}
		System.out.println(" Random numbers are: " + randomcounter[l]);
	}
}
