package MinMaxSubsetSum;

import java.util.Scanner;

public class OptimalSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long sum = 0;
		long min = 2147483647;
		long max = 0;
		while(scan.hasNext()) {
			long n = scan.nextLong();
			sum = sum + n;
			if (min > n) {
				min = n;
			}
			if (max < n) {
				max = n;
			}
		}
		scan.close();
		System.out.println((sum - max) + " " + (sum - min));
	}
}
