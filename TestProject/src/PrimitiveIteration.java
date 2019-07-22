
public class PrimitiveIteration {

	public static void main(String args[]) {
		int arr[] = {1,7,2,15,6,3,24,4,11};
		MergeSort m = new MergeSort();
		m.sort(arr , 0, arr.length-1);
		printArray(arr);
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
	
	
}
class MergeSort{

	
	/**
	 * Split and Sort
	 */
	public void sort(int arr[], int l , int r	) {
		if(l<r) {
			//Find the middle point
			
			int mid = (l+r)/2;
			//Sort first and second halves
			
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			//merge the sorted halves
			merge(arr, l,mid,r);
		}
	}
	private void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int n1= mid-l+1;
		int n2= r-mid;
		
		int Left[]=new int[n1];
		int Right[]=new int[n2];
		//Copy elements to left array
		for(int i=0;i<n1;i++) {
			Left[i]=arr[l+i];
		}
		//Copy elements to right array
		for(int j=0;j<n2;j++) {
			Right[j]=arr[mid+1+j];
		}
		
		//Sort both arrays
		
		//initial indexes of both arrays
		int i=0,j=0;
		//initial index of merged subarray
		int k=l;
		while(i<n1 && j<n2){
			
			if(Left[i]<=Right[j]) {
				arr[k]= Left[i];
				i++;
			}
			else {
				arr[k]=Right[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = Right[j]; 
            j++; 
            k++; 
        } 
	}
}