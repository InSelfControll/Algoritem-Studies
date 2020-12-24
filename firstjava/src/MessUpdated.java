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
		
		for (j = 0; j < 6 ;j ++) {
			randomcounter[j] = rnd.nextInt(37) + 1;
			/*System.out.println("Random numbers are: " + randomcounter[j]);*/
		}
		
		for (i = 0; i < 6; i++) {
			usernumber[i] = userinput.nextInt();
			for (j = 0; j < 6; j++) {
				if (randomcounter[j] == usernumber[i]) {
					counters++;
				}else {
				}
			}
		}
		System.out.println("You're correct in: " + counters);
		System.out.println("\n");
		for (j = 0; j < 6; j++) {
			System.out.println("Random numbers are: " + randomcounter[j]);
		}
	}
}