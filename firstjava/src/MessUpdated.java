import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MessUpdated {

	public static void main(String[] args) {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		int[] usernumber = new int[6];
		int[] randomcounter = new int[6];
		List < Integer > numbers = new ArrayList < > ();


		int i,j,l;
		int counters = 0;
		
		for (j = 0; j < 6 ;j ++) {
			randomcounter[j] = rnd.nextInt(37) + 1;
			boolean check = true;
			while (check) {
				if ( check == false) {
					j++;
				} else {
					//System.out.println("Done! ");
				}
			}
			/*System.out.println("Random numbers are: " + randomcounter[j]);*/
		}
		
		for (i = 0; i < 6; i++) {
			usernumber[i] = userinput.nextInt();
			for (j = 0; j < 6; j++) {
				if (usernumber[i] == randomcounter[j]) {
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