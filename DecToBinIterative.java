
public class DecToBinIterative {

	public static String decToBinIterative(int dec) {
		
		if (dec == 0) {
			return "0";
		}
		
		StringBuilder binary = new StringBuilder();
		
		while (dec > 0) {
			binary.insert(0, dec % 2);
			dec = dec/2;
		}
		
		return binary.toString();
	}
	
	public static void main(String[] args) {
		int dec = 10;
		System.out.println("Decimal: " + dec + "\nBinary Iterative: " + decToBinIterative(dec));
	}
	
}
