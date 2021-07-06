import java.util.Scanner;

public class stopWatch {
public static void main(String[] args) {
	double start, stop, elapse_time;
	System.out.println("Enter 1 to start the time");
	Scanner sc = new Scanner(System.in);
	start = sc.nextInt();
	start = System.currentTimeMillis();
	System.out.println("Enter 0 to stop the time");
	stop = sc.nextInt();
	stop = System.currentTimeMillis();
	elapse_time = (stop - start) / 1000;
	System.out.println("Elapsed time is" + elapse_time + "seconds");
}
}
