
public class DecToBinRecursive {

	public static String decToBinRecursive(int dec) {
		
		if (dec == 0) {
			return "";
		}
		
		return decToBinRecursive(dec / 2) + (dec % 2);
	}
	
	public static void main(String[] args) {
		int dec = 10;
		String binary = dec == 0 ? "0" : decToBinRecursive(dec);
		System.out.println("Decimal: " + dec + "\nBinary Recursive: " + binary);
	}

}
