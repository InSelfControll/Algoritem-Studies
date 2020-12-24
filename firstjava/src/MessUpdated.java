import java.util.Random;
import java.util.Scanner;

public class MessUpdated {

	public static void main(String[] args) {

		// int UserSelection = us();
		int UserSelection = us();
		int rnd = RandomNumbers();
		int counter = 0;
		int i = 0;

		for (i = 1; i < 7; i++) {
			if (UserSelection == rnd) {
				counter++;
				System.out.println("You guessed the right number! " + counter);
			} else {
				System.out.println("Try next time! ");
			}
		}
	}

	public static int RandomNumbers() {

		Random rnd = new Random();

		int counter = rnd.nextInt(4) + 1;
		int counter1 = rnd.nextInt(37) + 1;
		int counter2 = rnd.nextInt(37) + 1;
		int counter3 = rnd.nextInt(37) + 1;
		int counter4 = rnd.nextInt(37) + 1;
		int counter5 = rnd.nextInt(37) + 1;

		System.out
				.println(counter + " " + counter1 + " " + counter2 + " " + counter3 + " " + counter4 + " " + counter5);
		return 0;
	}

	@SuppressWarnings("resource")
	// User Selection
	public static int us() {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		// User Selection
		int unumber = sc.nextInt();
		int unumber1 = sc.nextInt();
		int unumber2 = sc.nextInt();
		int unumber3 = sc.nextInt();
		int unumber4 = sc.nextInt();
		int unumber5 = sc.nextInt();

		int counter = rnd.nextInt(4) + 1;
		int counter1 = rnd.nextInt(37) + 1;
		int counter2 = rnd.nextInt(37) + 1;
		int counter3 = rnd.nextInt(37) + 1;
		int counter4 = rnd.nextInt(37) + 1;
		int counter5 = rnd.nextInt(37) + 1;

		System.out
				.println(counter + " " + counter1 + " " + counter2 + " " + counter3 + " " + counter4 + " " + counter5);

		int i = 1;
		for (i = 1; i < 7; i++) {
			if (counter == unumber || counter == unumber1 || counter == unumber2 || counter == unumber3
					|| counter == unumber4 || counter == unumber5) {
				return 0;
			} else if (counter1 == unumber || counter1 == unumber1 || counter1 == unumber2 || counter1 == unumber3
					|| counter1 == unumber4 || counter1 == unumber5) {
				return 0;
			} else if (counter2 == unumber || counter2 == unumber1 || counter2 == unumber2 || counter2 == unumber3
					|| counter2 == unumber4 || counter2 == unumber5) {
				return 0;
			} else if (counter3 == unumber || counter3 == unumber1 || counter3 == unumber2 || counter3 == unumber3
					|| counter3 == unumber4 || counter3 == unumber5) {
				return 0;
			} else if (counter4 == unumber || counter4 == unumber1 || counter4 == unumber2 || counter4 == unumber3
					|| counter4 == unumber4 || counter4 == unumber5) {
				return 0;
			} else if (counter5 == unumber || counter5 == unumber1 || counter5 == unumber2 || counter5 == unumber3
					|| counter5 == unumber4 || counter5 == unumber5) {
				System.out.println("You guessed the right number! " + counter);
				return 0;
			} else {
				System.out.println("You failed! ");
			}
		}

		// if (counter1 == unumber || counter == unumber1 || counter == unumber2 ||
		// counter == unumber3 || counter == unumber4 || counter == unumber5) {
		System.out.println("\n");
		System.out.println(
				unumber + " " + unumber1 + " " + unumber2 + " " + unumber3 + " " + unumber4 + " " + unumber5 + "\n");
		System.out.println(unumber1);
		System.out.println(unumber2);
		System.out.println(unumber3);
		System.out.println(unumber4);
		System.out.println(unumber5 + "\n");
		return 0;
	}
}
