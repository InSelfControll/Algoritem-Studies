import java.util.Random;
import java.util.Scanner;

public class Mess {

	public static void main(String[] args) {

		// int UserSelection = us();
		us();
		RandomNumbers();
	}

	public static int RandomNumbers() {

		Random rnd = new Random();

		int i = 0;
		int UserSelection = us();

		int counter = rnd.nextInt(4) + 1;
		int counter1 = rnd.nextInt(37) + 1;
		int counter2 = rnd.nextInt(37) + 1;
		int counter3 = rnd.nextInt(37) + 1;
		int counter4 = rnd.nextInt(37) + 1;
		int counter5 = rnd.nextInt(37) + 1;

		System.out.println(counter);
		System.out.println(counter1);
		System.out.println(counter2);
		System.out.println(counter3);
		System.out.println(counter4);
		System.out.println(counter5);

		// if (i < 6 ){
		if (UserSelection == counter && UserSelection == counter1 && UserSelection == counter2
				&& UserSelection == counter3 && UserSelection == counter4 && UserSelection == counter5) {
			i++;
			System.out.println("You got a hit! " + i);
		} else {
			System.out.println("Finished! ");
		}
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
		System.out.println(unumber);
		System.out.println(unumber1);
		System.out.println(unumber2);
		System.out.println(unumber3);
		System.out.println(unumber4);
		System.out.println(unumber5 + "\n");
		return 0;
	}
}
