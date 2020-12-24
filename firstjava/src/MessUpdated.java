import java.util.Scanner;
import java.util.Random;

public class MessUpdated {

	static Scanner input = new Scanner(System.in);
	static Random generator = new Random();

	public static void main(String[] args) {
		game(0);
	}

	public static int random() {
		int number, number1, number2, number3, number4, number5;
		number = generator.nextInt(37) + 1;
		number1 = generator.nextInt(37) + 1;
		number2 = generator.nextInt(37) + 1;
		number3 = generator.nextInt(37) + 1;
		number4 = generator.nextInt(37) + 1;
		number5 = generator.nextInt(37) + 1;
		System.out.println("Guess a number");
		game(number);
		game(number1);
		game(number2);
		game(number3);
		game(number4);
		game(number5);
		return 0;

	}

	public static void game(int number) {
		int inputStorage, inputStorage1, inputStorage2, inputStorage3, inputStorage4, inputStorage5;
		inputStorage = input.nextInt();
		inputStorage1 = input.nextInt();
		inputStorage2 = input.nextInt();
		inputStorage3 = input.nextInt();
		inputStorage4 = input.nextInt();
		inputStorage5 = input.nextInt();
		int number1 = random();
		int number2 = random();
		int number3 = random();
		int number4 = random();
		int number5 = random();
		if (inputStorage == number) {

			System.out.println("You guessed the right number! " + inputStorage);

		} else if (inputStorage1 == number1) {
			System.out.println("You guessed the right number! " + inputStorage1);
		} else if (inputStorage2 == number2) {
			System.out.println("You guessed the right number! " + inputStorage2);
		} else if (inputStorage3 == number3) {
			System.out.println("You guessed the right number! " + inputStorage3);
		} else if (inputStorage4 == number4) {
			System.out.println("You guessed the right number! " + inputStorage4);
		} else if (inputStorage5 == number5) {
			System.out.println("You guessed the right number! " + inputStorage5);
		} else if (inputStorage != number) {
			System.out.println("Nope, guess again");
			game(number);

		}
	}
}
