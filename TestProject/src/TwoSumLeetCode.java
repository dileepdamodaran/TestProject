import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
/**
 * 
 * @author dileepdamodaran
 *
 */
public class TwoSumLeetCode {
	
	public static void main(String args[]) {
		int nums[] = {2,7,11,15};
		int target = 9;
		int output[] = twoSum(nums, target);
		Arrays.stream(output).forEach(System.out::println);
	}

	private static int[] twoSum(int[] nums, int target) {
			Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;map.put(nums[i], i++)) {
			
			if(map.containsKey(target-nums[i])) {
				
				return new int[] {map.get(target-nums[i]),i};
			}
		
		}
		
		return new int[] {0,0};
	}

	}
