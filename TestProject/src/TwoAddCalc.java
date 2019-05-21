import java.util.HashMap;
import java.util.Map;

public class TwoAddCalc {

	
	public static void main(String args[]) {
		
		//Time Complexity: O(n2)
		int nums[]= {0,1,6,8,10,12,4};
		int target =12;
		outer:for(int i=0;i<nums.length; i++) {
			for(int j=i+1 ;j<nums.length;j++) {
				if(target == nums[i]+nums[j]) {
					
					 System.out.println( "i ::::: "+i +" j::: "+j);
					 System.out.println( " num i::::: "+nums[i ]+" num j::: "+nums[j]);
					 break outer; 
				}
				
			}
		}
		
		//Using hashmap
		Map<Integer,Integer> items = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length; i++) {
			items.put(nums[i],i);
		}
		
		for(int i=0;i<nums.length; i++) {
			int complement = target - nums[i];
			System.out.println( " :: complement :: "+complement);
			if(items.containsKey(complement) && items.get(complement)!=i ) {
				
				 System.out.println( " :: index :: "+i);
				 System.out.println( " :: value :: "+nums[i]);
				 break;
			}
			
			
		}
		
	}
	
}
