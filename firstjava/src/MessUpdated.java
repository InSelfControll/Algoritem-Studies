import java.util.Random;
import java.util.Scanner;

public class MessUpdated {

	public static void main(String[] args) {

		// int UserSelection = us();
		Scanner userinput = new Scanner(System.in);
		Random rnd = new Random();

		// User Selection
		int unumber = userinput.nextInt();
		int unumber1 = userinput.nextInt();
		int unumber2 = userinput.nextInt();
		int unumber3 = userinput.nextInt();
		int unumber4 = userinput.nextInt();
		int unumber5 = userinput.nextInt();

		System.out.println("\n");
		System.out.println(
				unumber + " " + unumber1 + " " + unumber2 + " " + unumber3 + " " + unumber4 + " " + unumber5 + "");

		int counter = rnd.nextInt(37) + 1;
		int counter1 = rnd.nextInt(37) + 1;
		int counter2 = rnd.nextInt(37) + 1;
		int counter3 = rnd.nextInt(37) + 1;
		int counter4 = rnd.nextInt(37) + 1;
		int counter5 = rnd.nextInt(37) + 1;

		int counters = 0;
		int i = 0;
		if (unumber == counter || unumber1 == counter || unumber2 == counter || unumber3 == counter
				|| unumber4 == counter || unumber5 == counter && unumber == counter1 || unumber1 == counter1
				|| unumber2 == counter1 || unumber3 == counter1 || unumber4 == counter1
				|| unumber5 == counter1 && unumber == counter2 || unumber1 == counter2 || unumber2 == counter2
				|| unumber3 == counter2 || unumber4 == counter2 || unumber5 == counter2 && unumber == counter3
				|| unumber1 == counter3 || unumber2 == counter3 || unumber3 == counter3 || unumber4 == counter3
				|| unumber5 == counter3 && unumber == counter4 || unumber1 == counter4 || unumber2 == counter4
				|| unumber3 == counter4 || unumber4 == counter4 || unumber5 == counter4 && unumber == counter5
				|| unumber1 == counter5 || unumber2 == counter5 || unumber3 == counter5 || unumber4 == counter5
				|| unumber5 == counter5) {
			counters++;

			System.out.println("You guessed  " + counters + " right!" + " \n");
			System.out.println(counter + " " + counter1 + " " + counter2 + " " + counter3 + " " + counter4 + " "
					+ counter5 + "\n");
			return;

		} else {
			System.out.println("You failed! ");
			System.out.println(
					counter + " " + counter1 + " " + counter2 + " " + counter3 + " " + counter4 + " " + counter5 + "\n");
		}

	}
}
