import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TestJava {

	public static void main(String args[]) {
		int arr[]= {1,2,3,4};
		int length =arr.length;
		int nums[]= {2,7,11,15};
		int target =9;
				;
	/*	findMid(arr,0,length-1,2);
		System.out.println(checkPalindrome("malayalam"));
		Character a='a';
		Character b='d';
		System.out.println("a less than b "+(a<b));
		calculateBinaryRepresentation(75);
		testNode();
		LinkedList l =new LinkedList();
		int ar[]= {};
		if(null != ar && ar.length>1) {
			
		}*/
		/*int arr1[] = {-1, 0, 1, 2, -1, -4};
		Arrays.sort(arr1);
		System.out.println(arr1);
		
		LinkedList<String> lnkLst = new LinkedList<String>();
		lnkLst.add("A");
		lnkLst.add("B");
		lnkLst.add("C");
		System.out.println("lnklist"+lnkLst.getFirst());*/
				twoSum(nums, target);
		String duplicatChar ="abbdef";
		System.out.println(duplicatChar.charAt(3)-'a');
		 
	}

	private static int[] twoSum(int nums[],int target) {
		 Map<Integer,Integer> map = new HashMap();
	        for(int i=0;i<nums.length;map.put(nums[i], i++)){
	            
	            if(map.containsKey(target-nums[i])){
	                return new int[]{map.get(target-nums[i]),i};
	                
	            }
	           
	        }
	         return new int[]{0,0};
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
