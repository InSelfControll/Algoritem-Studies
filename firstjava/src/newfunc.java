import java.util.Random;
import java.util.Scanner;

public class newfunc {

	@SuppressWarnings("resource")
	public static  int[] home() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		int v = rnd.nextInt(200);
		System.out.println(v);
		
		int x = rnd.nextInt(200);
		System.out.println(x);
		
		int sum = v + b +n +x;
		
		int max = Math.max(n, Math.max(b, Math.max(v, x)));
		
		int[] ans = new int[2];
		ans[0] = sum;
		ans[1] = max;
		
		System.out.printf("Sum: " + ans[0] + "\n");
		System.out.printf("Max Number: " + ans[1] + "\n");
		return ans;
	}
}
