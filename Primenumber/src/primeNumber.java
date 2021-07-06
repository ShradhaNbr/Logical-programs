import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		int n;
		boolean isprime = true;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isprime = false;
			}
		}

		if (isprime)
			System.out.println(n + " is prime");
		else

			System.out.println(n + " is not prime");
	}
}
