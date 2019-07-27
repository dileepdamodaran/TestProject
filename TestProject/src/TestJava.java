import java.util.LinkedList;

public class TestJava {

	public static void main(String args[]) {
		int arr[]= {1,2,3,4};
		int length =arr.length;
		
		findMid(arr,0,length-1,2);
		System.out.println(checkPalindrome("malayalam"));
		Character a='a';
		Character b='d';
		System.out.println("a less than b "+(a<b));
		calculateBinaryRepresentation(75);
		testNode();
		LinkedList l =new LinkedList();
		int ar[]= {};
		if(null != ar && ar.length>1) {
			
		}
	}

	
	
	private static void testNode() {
		// TODO Auto-generated method stub
		Node n =new Node(8);
		n.insert(5);
		n.insert(10);
		n.insert(9);
		n.insert(1);
		n.insert(2);
	}



	private static void calculateBinaryRepresentation(int n) {
		// TODO Auto-generated method stub
		
		if(n>1) {
			calculateBinaryRepresentation(n/2);
		}
		
		
		System.out.println(" n is : "+n+" binaryRep is "+n%2);
		
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
