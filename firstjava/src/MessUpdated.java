import java.util.HashSet;
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
		int[] randomcounter = new int[6];
		 Set<Integer> numbers = new HashSet<>();

		int i = 0;
		int j = 0;
		int counters = 0;

		randomcounter[j] = rnd.nextInt(37)+1;
        while(i < 6){
            if(numbers.add(rnd.nextInt(37)+1)){
                i++;
            }
            System.out.println("Random numbers are: " + i);
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