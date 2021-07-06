import java.util.Scanner;

public class reverseANumber {
	public static void main(String[] args) {
		int num, rev = 0, rem;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {
		rem = num % 10;
		rev = rev * 10 + rem;
		num = num / 10;
		}
		System.out.println("Reverse is" + rev);
	}
}
