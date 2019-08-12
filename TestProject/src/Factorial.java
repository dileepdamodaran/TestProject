/**
 * 
 * @author dileepdamodaran
 *
 */
public class Factorial {
	
	public static void main(String args[]) {
		int factorial =findFactorial(5);
		//System.out.println("factorial"+factorial );
	}

	private static int findFactorial(int i) {
		System.out.println("calc factorial "+i);
		if(i<=1) {
			System.out.println("calc factorial less than<=1 "+i);
			return i;
		}
		i=i*findFactorial(i-1);
		System.out.println("factorial "+i);
		return i;
	}

}
