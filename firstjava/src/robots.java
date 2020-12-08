import java.util.Scanner;

public class robots {

	public static void main(String[] args) {
		a1();
	}

	@SuppressWarnings("resource")
	public static int rsum() {
		Scanner scan = new Scanner(System.in);

		// Right numbers
		int a = scan.nextInt();
		int x = scan.nextInt();
		int f = scan.nextInt();
		// End Right numbers

		int rsum = a + x + f;
		return Math.max(rsum, rsum);
	}

	@SuppressWarnings("resource")
	public static int lsum() {
		Scanner scan = new Scanner(System.in);

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();
		// End Left numbers
		int lsum = g + h + j;
		System.out.println("Please put the numbers in the left cells! ");
		return Math.max(lsum,j);
	}

	@SuppressWarnings("resource")
	public static int lmax() {
		Scanner scan = new Scanner(System.in);

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();
		// End Left numbers
		int lemax = Math.max(g, Math.max(h, j));
		System.out.println("Please put the numbers in the left cells! ");
		return lemax;
	}
	
	public static int rmax() {
		Scanner scan = new Scanner(System.in);

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();
		// End Left numbers
		int remax = Math.max(g, Math.max(h, j));
		System.out.println("Please put the numbers in the left cells! ");
		return remax;
	}
	
	public static void a1() {

		int lsum = lsum();
		int rsum = rsum();
		if (lsum > rsum) {
			if (rmax() > lmax()){
				System.out.println("rMax is bigger than lMax: " + rmax());
			}else {
				System.out.println("lMax is bigger than rMax: " + lmax());
			}
			System.out.println("lSum is bigger than rsum: " + rmax());
		} else if (rsum > lsum || rsum == lsum) {
			if (rsum > lsum) {
				System.out.println("rSum is bigger than lsum: " + + lmax());
			} else {
				System.out.println("rSum is equals to lsum: " + "rSum is: " + rsum + " lSum is : " + lsum);
			}
		}
	}
}
