/**
 * 
 * @author dileepdamodaran
 *
 */
public class MergeSortMain {
	
	public static void main(String args[]) {
		int arr[]= {9,3,5};
		int temp[]=new int[arr.length];
		mergeSort(arr,  0, arr.length-1);
		printArray(arr);
		
	}
	
	private static void mergeSort(int[] arr, int leftStart, int rightEnd) {
		
		if(leftStart<rightEnd) {

			int middle = (leftStart+rightEnd)/2;
			mergeSort(arr ,  leftStart, middle);
			mergeSort(arr,  middle+1, rightEnd);
			merge(arr,  leftStart, middle, rightEnd);
		}
	}

	private static void merge(int[] arr,  int l, int m, int r) {
		// Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
		
	}

	private static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
		
	
	
	
}
