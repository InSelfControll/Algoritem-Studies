import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MessUpdated {

	public static void main(String[] args) {

		us();

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

		System.out.println("Please enter your guesses! ");

		// User Selection
		int[] unumber = new int[7];

		List<Integer> counter = IntStream.range(1, 38).boxed().collect(Collectors.toList());

		Collections.shuffle(counter);

		// sc.nextInt();
		/*
		 * int unumber1 = sc.nextInt(); int unumber2 = sc.nextInt(); int unumber3 =
		 * sc.nextInt(); int unumber4 = sc.nextInt(); int unumber5 = sc.nextInt();
		 */

		int i = 0;
		for (i = 0; i < 7; i++) {
			unumber[i] = counter.get(i);
		}
		return 0;

	}
}
