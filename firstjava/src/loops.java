import java.util.Random;


public class loops {
	
	public static void main (String[] args) {
		
		m.main(args);
		
		int glass;
		int i = 20;
		int [] doom = new int[20];
		Random rand = new Random();
		for (glass = 0; glass < doom.length ; glass = glass + 1 ) {
			doom[glass]= rand.nextInt(100);
			//System.out.println("Hey: " + doom[glass]);
			if (doom[glass] < i) {
				System.out.println("Number is lower than " + i );
			}else {
				System.out.println("It worked " + doom[glass]);
			}		
		}
	}
}

