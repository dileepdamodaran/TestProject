/**
 * 
 * @author dileepdamodaran
 *
 */
public class MainClass {
	 public static void main (String args[])
	 {
		/*
		 * System.out.println("First commit"); int i []= {1,6,2,8,3,4,6};
		 * System.out.println("i length "+i.length); for(int l=0;l<i.length;l++) {
		 * myOwnSort(i, l); }
		 */
		// BubbleSort bubbleSort = new BubbleSort();
		 //bubbleSort.bubbleSort();
		 QuickSort quickSort=new QuickSort();
		 quickSort.quickSort();
		 String test="testing";
		 Singleton singleton = Singleton.getInstance();
		 singleton.demoMethod();
		 testMethod(test);
		 System.out.println(test);
		/*
		 * for(int j=0; j<i.length;j++) { System.out.println("value of j "+i[j]);
		 * 
		 * 
		 * }
		 */
		 
	 }
	 
	 private static void testMethod(String test) {
		test="text modfiied";
		
	}

	public static void myOwnSort(int[] i,int strtIndx) {
		 for(int k=strtIndx; k+1<i.length;k++) {
			 System.out.println("value of k "+k);
			 if(i[k+1]<i[k]) {
				 int a= i[k];
				 i[k]= i[k+1];
				 i[k+1] = a;
				 
			 }
			 
		 }
	 }
}
