import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MessUpdated {

	public static void main(String[] args) {

		// int UserSelection = us();
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[7];
		int[] randomcounter = new int[7];

		int i = 7;
		int j = 7;
		int counters = 0;

		for (i = 1; i <= 7; i++) {
			usernumber[i] = userinput.nextInt();
			randomcounter[i] = rnd.nextInt(37) + 1;
			for (j = 1; j <= 7; j++) {
				if (usernumber[i] == randomcounter[j]) {
					System.out.println(usernumber[i] + "You correct! ");
					counters++;
				}
			}
		}
		System.out.println("You're correct in: " + counters);
	}
}
