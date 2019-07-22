
public class TestJava {

	public static void main(String args[]) {
		int arr[]= {1,2,3,4};
		int length =arr.length;
		
		findMid(arr,0,length-1,2);
		System.out.println(checkPalindrome("malayalam"));
		calculateBinaryRepresentation(75);
	}

	private static void calculateBinaryRepresentation(int n) {
		// TODO Auto-generated method stub
		
		if(n>1) {
			calculateBinaryRepresentation(n/2);
		}
		System.out.println(" n is : "+n+" binary is "+n%2);
		
	}

	private static boolean checkPalindrome(String string) {
		// TODO Auto-generated method stub
		int lastIndex =string.length()-1;
		for(int i=0;i<string.length();i++) {
			if(i==lastIndex) {
				return string.charAt(i)==string.charAt(lastIndex);
			}else {
				if(string.charAt(i)==string.charAt(lastIndex)) {
					lastIndex--;
				}else {
					return false;
				}
			}
		}
		return false;
	}

	private static void findMid(int[] arr, int i, int r,int x) {
		// TODO Auto-generated method stub
		System.out.println(" start index "+i+ " length "+r);
		if(r>=1) {
			System.out.println(" r>1");
			int mid= i+(r-1)/2;
			System.out.println("mid"+mid);
			findMid(arr,i,mid-1,x);
		}
	}
}
