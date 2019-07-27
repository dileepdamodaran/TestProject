import java.util.Arrays;
/**
 * John works at a clothing store. 
 *  He has a large pile of socks that he must pair by color for sale.  
 *  Given an array of integers representing the color of each sock,
 *   determine how many pairs of socks with matching colors there are.
 * @author dileepdamodaran
 *
 */
public class Sockpair {
	
	public static void main(String args[]) {
		int ar[]= {10,20,20,10,10,30,50,10,20};
		int n= 9;
		int pair=0;
        if(null !=ar && n>0){
            //Sort Arrays
                //[10, 10, 10, 10, 10, 20, 20, 20, 30, 50]
        	
                Arrays.sort(ar);
               
                
               
                int i=0;
               
                while((i+1)<n){
                	if( ar[i]==ar[i+1]) {
                		pair ++;
                		i=i+2;
                	}else {
                		i++;
                	}
                	
                }
        }
        System.out.println( " Matching pair of socks  "+pair);
         
	}
}
