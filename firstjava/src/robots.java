import java.util.Scanner;

public class robots {


	
	public static void main(String[] args) {
		a1();
	}

	
	@SuppressWarnings("resource")
	public static int rsum () {
		Scanner scan = new Scanner(System.in);

		// Right numbers
		int a = scan.nextInt();
		int x = scan.nextInt();
		int f = scan.nextInt();
		// End Right numbers
		
		int rsum = a + x +f;
		return Math.max(rsum, rsum);
	}
	
	@SuppressWarnings("resource")
	public static int lsum () {
		Scanner scan = new Scanner(System.in);

		// Start Left numbers
		int g = scan.nextInt();
		int h = scan.nextInt();
		int j = scan.nextInt();
		// End Left numbers
		int lsum = g + h + j;
		System.out.println("Please put the numbers in the left cells! " );
		return lsum;
	}	
	
	public static void a1( ) {
		
		int lsum = lsum();
		int rsum = rsum();
		if (lsum > rsum) {
			System.out.println("lSum is bigger than rsum: " + lsum);
		} else if (rsum > lsum || rsum == lsum) {
			if (rsum > lsum) {
				System.out.println("rSum is bigger than lsum: " + rsum);
			}else {
				System.out.println("rSum is equals to lsum: " + "rSum is: " + rsum + 
						" lSum is : "  + lsum);
			}
			
		} else {
			
		}
		
	}
}
