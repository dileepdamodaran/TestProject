
public class TotalWeightfromString {

	public static void main(String args[]) {
		String input ="+6b25 +50 +3b10 -50";
		String pattern ="b";
		int totalWeight=0;
		String boxWeightArr[] =input.split(" ");
		for(String indvBox:boxWeightArr) {
			if(indvBox.contains(pattern)) {
				String indW[] =indvBox.split(pattern);
				try {
					totalWeight += Integer.parseInt(indW[0]) * Integer.parseInt(indW[1]);
				} catch (Exception e) {
					System.out.println(" processing failed for pattern"+indvBox);
					break;
				}
				}else{
				try {
					totalWeight+=Integer.parseInt(indvBox);
				} catch (Exception e) {
					System.out.println(" processing failed  no pattern"+indvBox);
					break;
				}
			}
		}
		System.out.println(" totalWeight : postprocessing "+totalWeight);
	}
}
