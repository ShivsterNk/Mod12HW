
public class FibonacciIterative {

	public static int fibIter(int n) {
		
		if (n == 0) {
			return n;
		}
		else if (n == 1) {
			return n;
		}
		
		int a = 0; 
		int b = 1;
		
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Fibonacci Iterative of " + n + ": " + fibIter(n));
	}

}
