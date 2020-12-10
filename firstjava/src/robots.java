import java.util.Scanner;

public class robots {

	public static void main(String[] args) {
		a1();
	}

	@SuppressWarnings("resource")
	public static int rsum() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please put the numbers in the right cells! ");

		// Right numbers
		int a = scan.nextInt();
		int x = scan.nextInt();
		int f = scan.nextInt();
		// End Right numbers

		int rsum = a + x + f;
		return rsum;
	}

	@SuppressWarnings("resource")
	public static int lsum() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please put the numbers in the left cells! ");

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();
		// End Left numbers
		int lsum = g + h + j;

		return lsum;
	}

	@SuppressWarnings("resource")
	public static int lmax() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please put the numbers in the left cells! ");

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();
		// End Left numbers
		int lemax = Math.max(g, Math.max(h, j));

		return lemax;
	}

	@SuppressWarnings("resource")
	public static int rmax() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please put the numbers in the right cells! ");

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();

		// End Left numbers
		int remax = Math.max(g, Math.max(h, j));

		/* return remax; */
		return remax;
	}

	public static void a1() {

		System.out.println(" First step - rSum & lSum: ");
		int lsum = lsum();
		int rsum = rsum();
		if (lsum > rsum) {
			System.out.println("lSum is bigger than rsum: " + lsum);
		} else if (lsum == rsum) {
			System.out.println("lSum is equal to rsum: " + lsum + '\t' + rsum);
		} else {
			System.out.println("rSum is bigger than sum: " + rsum);
		}
		System.out.println('\n');
		System.out.println("Second step - rMax & lMax: ");
		int rmax = rmax();
		int lmax = lmax();
		if (rmax > lmax) {
			System.out.println("rightMax is bigger than leftMax: " + rmax);
		} else {
			System.out.println("leftMax is bigger than rightMax: " + lmax);
		}
	}

	public static String CONVERT(int x, int y, int z) {
		char c1 = '0';
		char c2 = '0';
		char c3 = '0';
		if (x == 1)
			c1 = 'a';
		if (x == 2)
			c1 = 'b';
		if (x == 3)
			c1 = 'c';
		if (x != 1 && x != 2 && x != 3)
			c1 = 'z';
		if (y == 1)
			c2 = 'a';
		if (y == 2)
			c2 = 'b';
		if (y == 3)
			c2 = 'c';
		if (y != 1 && y != 2 && y != 3)
			c2 = 'z';
		if (z == 1)
			c3 = 'a';
		if (z == 2)
			c3 = 'b';
		if (z == 3)
			c3 = 'c';
		if (z != 1 && z != 2 && z != 3)
			c3 = 'z';
		return (c1 + "" + c2 + "" + c3);
	}
}
