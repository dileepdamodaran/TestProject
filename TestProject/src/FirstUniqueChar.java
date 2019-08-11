import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
	
	
	public static void main(String args[]) {
		
		String s ="leetcode";
        System.out.println(" findFirstUnique(s) "+findFirstUnique(s));
        System.out.println(" finFirstUniqueLeetCodeSoln(s) "+finFirstUniqueLeetCodeSoln(s));
	}

	private static int finFirstUniqueLeetCodeSoln(String s) {
		  int freq [] = new int[26];
	        for(int i = 0; i < s.length(); i ++)
	            freq [s.charAt(i) - 'a'] ++;
	        for(int i = 0; i < s.length(); i ++) {
	            if(freq [s.charAt(i) - 'a'] == 1)
	              return i;
	        }
		return -1;
	}

	private static int findFirstUnique(String s) {

        Map<Character,Integer> count = new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count.put(c, (null !=count.get(c) ?(count.get(c)+1):1));
        }
        
        for(int i =0;i<s.length();i++){
            if (count.get(s.charAt(i)) ==1 )
                return i;
        }
        return -1;
		
	}
}
