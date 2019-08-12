
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author dileepdamodaran
 *
 */
public class PhoneNumLetterCombn {

	
	public static void main(String args[]) {
		mapNmToLetter();
		int combntn=23;
		fetchLetterCombinations(combntn);
	}

	private static void fetchLetterCombinations(int combntn) {
		// TODO Auto-generated method stub
		//Convert to Array
		String[] arrSt = convertToArray((Integer)combntn);
		Map nmbrToLtr= mapNmToLetter();
		
		for(String s :arrSt) {
			nmbrToLtr.get(s);
		}
	}

	
	private static String[] convertToArray(Object input) {
		// TODO Auto-generated method stub
		String inputStr = "";
		if(input instanceof Integer){
			inputStr = input.toString();
		}
		
		String[] outPut = new String[inputStr.length()];
		for(int i=0;i<inputStr.length();i++) {
			outPut[i]=String.valueOf(inputStr.charAt(i));
		}
		
		return outPut;
	}

	/**
	 * Map Number to letters
	 * @return 
	 */
	private static Map mapNmToLetter() {
		Map numLtr = new HashMap();
		numLtr.put("2", "abc");
		numLtr.put("3", "def");
		numLtr.put("4", "ghi");
		numLtr.put("5", "jkl");
		numLtr.put("6", "mno");
		numLtr.put("7", "pqrs");
		numLtr.put("8", "tuv");
		numLtr.put("9", "wxyz");
		
		return numLtr;
		
	}
}

	