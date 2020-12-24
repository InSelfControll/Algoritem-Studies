import java.util.Random;
import java.util.Scanner;

public class Mess {

	public static void main(String[] args) {

		// int UserSelection = us();
		int UserSelection = us();
		int rnd = RandomNumbers();
		int counter = 0;
		int i = 0;

		for (i = 1; i <= 7; i++) {
			if (UserSelection == rnd) {
				counter++;
			} else {
				System.out.println("Try next time! ");
			}
		}
		System.out.println("You guessed the right number! " + counter);
	}

	public static int RandomNumbers() {

		Random rnd = new Random();

		int counter = rnd.nextInt(37) + 1;
		int counter1 = rnd.nextInt(37) + 1;
		int counter2 = rnd.nextInt(37) + 1;
		int counter3 = rnd.nextInt(37) + 1;
		int counter4 = rnd.nextInt(37) + 1;
		int counter5 = rnd.nextInt(37) + 1;

		System.out.println(
				counter + " " + counter1 + " " + counter2 + " " + counter3 + " " + counter4 + " " + counter5 + "\n");
		/*
		 * System.out.println(counter1); System.out.println(counter2);
		 * System.out.println(counter3); System.out.println(counter4);
		 * System.out.println(counter5);
		 */

		/*
		 * if (counter == counter1) { return counter1; } else if (counter == counter2) {
		 * return counter2; } else if (counter == counter3) { return counter3; } else if
		 * (counter == counter4) { return counter4; } else if (counter == counter5) {
		 * return counter5; }
		 * 
		 * if (counter1 == counter) { return counter; } else if (counter1 == counter2) {
		 * return counter2; } else if (counter1 == counter3) { return counter3; } else
		 * if (counter1 == counter4) { return counter4; } else if (counter1 == counter5)
		 * { return counter5; }
		 * 
		 * if (counter2 == counter) { return counter; } else if (counter2 == counter1) {
		 * return counter1; } else if (counter2 == counter3) { return counter3; } else
		 * if (counter2 == counter4) { return counter4; } else if (counter2 == counter5)
		 * { return counter5; }
		 * 
		 * if (counter3 == counter) { return counter; } else if (counter3 == counter1) {
		 * return counter2; } else if (counter3 == counter2) { return counter3; } else
		 * if (counter3 == counter4) { return counter4; } else if (counter3 == counter5)
		 * { return counter5; }
		 */

		// if (i < 6 ){
		// if (UserSelection == counter && UserSelection == counter1 && UserSelection ==
		// counter2
		// && UserSelection == counter3 && UserSelection == counter4 && UserSelection ==
		// counter5) {
		// i++;
		// System.out.println("You got a hit! " + i);
//		} else {
//			System.out.println("Finished! ");
//		}
		// }else {

		// }
		return 0;
	}

	@SuppressWarnings("resource")
	// User Selection
	public static int us() {

		Scanner sc = new Scanner(System.in);

		// User Selection
		int unumber = sc.nextInt();
		int unumber1 = sc.nextInt();
		int unumber2 = sc.nextInt();
		int unumber3 = sc.nextInt();
		int unumber4 = sc.nextInt();
		int unumber5 = sc.nextInt();

		System.out.println("\n");
		System.out.println(
				unumber + " " + unumber1 + " " + unumber2 + " " + unumber3 + " " + unumber4 + " " + unumber5 + "");
		System.out.println(unumber1);
		System.out.println(unumber2);
		System.out.println(unumber3);
		System.out.println(unumber4);
		System.out.println(unumber5 + "\n");
		return 0;
	}
}
