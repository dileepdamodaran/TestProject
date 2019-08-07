import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListTest {
	
	public static void main(String args[]) {
		Queue queue = new LinkedList();
		queue.add("Rohit Sharma");
		queue.add("Shikar dhawan");
		queue.add("rishabh pant");
		System.out.println("queue.peek(); "+queue.peek());
		System.out.println("queue.element(); "+queue.element());
		
		int arr[][] = {{0,0,0},{0,1,0},{0,0,0}};
		
		for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(" ::: i::::"+arr[i][j]+
                                  ":::::j:::::" +i + ":::"+j);
                
            }
        }
	}

}
