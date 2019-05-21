
public class QuickSort {

	public void quickSort() {
		
		int arrSort[]= {1,17,8,23,45,63,89,2,7,6,44};
		int j=arrSort.length-1;
		for(int i=0;i<arrSort.length;i++) {
			if(arrSort[i]==arrSort[j]) {
				break;
			}
			System.out.println(" arrSort[i] "+arrSort[i]+": arrSort[j] "+arrSort[j]);
			j--;
			
		}
	}
}
