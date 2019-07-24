
public class MergeSortMain {
	
	public static void main(String args[]) {
		int a[]= {1,9,2,6,3,11,4,5,8};
		split(a, 0, a.length);
	}

	private static int[] split(int[] a, int start, int length) {
		// TODO Auto-generated method stub
			//1) find mid
			//2) initialize left array
			//3) initialize right array
			//4) split until one element 
			//5) Start combining and sorting
		if(length <start)
				return a;
			int mid = (start +length)/2;
			int rightLength =length -mid;
			System.out.println(" mid "+ mid);
			
			split(a, start , mid);
			split(a,mid , rightLength);
			return a;
	}
	
	
	
}
