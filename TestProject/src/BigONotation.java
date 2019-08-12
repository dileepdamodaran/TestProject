/**
 * 
 * @author dileepdamodaran
 *
 */
public class BigONotation {
	
	private int[] theArray;
	private int arraySize;
	private int itemsInArray;
	static long startTime;
	static long endTime;
	
	public static void main (String[] args) {
		
	}
	
	public void addItemToArray(int newItem) {
		theArray[itemsInArray++] = newItem;
	}
	
	public void linearSearchForValue(int value) {
		boolean valueInArray = false;
		
		startTime = System.currentTimeMillis();
		for(int i=0;i<arraySize;i++) {
			if(theArray[i]==value) {
				valueInArray = true;	
				
			}
		}
		
	}
	public void generateRandomArray() {
		for(int i=0; i <arraySize; i++) {
			theArray[i]=(int)(Math.random()*1000)+10;
		}
		itemsInArray= arraySize-1;
	}
}
