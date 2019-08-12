
import java.util.Arrays;
/**
 * 
 * @author dileepdamodaran
 *
 */
public class BubbleSort {
	
	public void bubbleSort( ) {
		int arrSort[]= {1,6,2,9,8,7,3};
		
		for(int index=1 ;index<=arrSort.length-1;index++) {
			for(int j=0 ; j<arrSort.length-1;j++) {
				if(arrSort[j]>arrSort[j+1]) {
					int temp=arrSort[j];
					arrSort[j]=arrSort[j+1];
					arrSort[j+1] =temp;
					
				}
				
			}
			System.out.println("::  Sorting ::: "+ Arrays.toString(arrSort));
		}
		System.out.println(":: Post Sorting ::: "+ Arrays.toString(arrSort));
	}

}
