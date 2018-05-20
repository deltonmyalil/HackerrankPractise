package trailing_zeroes_in_factorial;
//https://www.hackerrank.com/contests/feutechcodejam2015/challenges/try-and-catch-exceptions-problem-c
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.org.apache.commons.lang.time.StopWatch;

public class Solution {
	static List<Integer> primeFactors = new ArrayList<>();
	static List<Integer> primeNumbers = new ArrayList<>();

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void primeGenerate(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
	}

	public static void primeFactorize(int n) {
		for (int i = 0; i < primeNumbers.size(); i++) {
			int currentPrime = primeNumbers.get(i);
			while (n % currentPrime == 0) {
				primeFactors.add(currentPrime);
//				System.out.print(currentPrime + ", ");
				n /= currentPrime;
			}
		}
	}

	public static void main(String[] args) {
//		StopWatch stopWatch = new StopWatch();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		primeGenerate(n);
		int count2 = 0, count5 = 0;
		for (int i = 2; i <= n; i++) {
			primeFactorize(i);
		}
		for (int j : primeFactors) {
			if (j == 2)
				count2++;
			else if (j == 5)
				count5++;
		}
		System.out.println("The number of trailing zeroes in " + n + "! is "+ Math.min(count2, count5));
	}
}
