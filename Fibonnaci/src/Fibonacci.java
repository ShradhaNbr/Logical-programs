import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n, num1 = 0, num2 = 1, fib;
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
			System.out.println("Fibonacci series are " + fib);
		}
	}
}
