import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MessUpdated {

	public static void main(String[] args) {

		// int UserSelection = us();
		@SuppressWarnings("resource")
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		int[] randomcounter = new int[6];

		int i;
		int counters = 0;

		for (i = 1; i <= 6; i++) {
			usernumber[i] = userinput.nextInt();
			randomcounter[i] = rnd.nextInt(37) + 1;
			for (i = 1; i <= 6; i++) {
				if (usernumber == randomcounter) {
					System.out.println(usernumber[i] + "You correct! ");
					counters++;
				} else {
					System.out.println("You're failed! " + randomcounter[i]);
				}
			}
		}
		System.out.println(randomcounter[i]);
		System.out.println("You're correct in: " + counters);
	}
}
