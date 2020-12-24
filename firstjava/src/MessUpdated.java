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
		int j;
		int counters = 0;

		for (i = 1; i <= 7; i++) {
			usernumber[i] = userinput.nextInt();
			randomcounter[i] = rnd.nextInt(37) + 1;
			for (j = 1; j <= 7; j++) {
				if (usernumber == randomcounter) {
					System.out.println(usernumber[j] + "You correct! ");
					counters++;
				}
			}
		}
		System.out.println("You're correct in: " + counters);
	}
}
