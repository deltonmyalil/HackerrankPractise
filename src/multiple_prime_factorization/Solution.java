package multiple_prime_factorization;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter test case number: ");
		int testCases = scanner.nextInt();
		scanner.nextLine();
		int[] numbers = new int[testCases];
		int maxnum = 0;
		//Input of numbers and finding the maximum of the numbers
		System.out.println("Enter Numbers:");
		for (int i = 0; i < testCases; i++) {
			numbers[i] = scanner.nextInt();
			scanner.nextLine();
			if (maxnum < numbers[i])
				maxnum = numbers[i];
		}

		//prime generation and storage in Linked List
		List<Integer> primeList = new LinkedList<>();
		for (int i = 2; i < maxnum; i++) {
			if (isPrime(i))
				primeList.add(i);
		}

		List<Integer> primeFactors = new LinkedList<>();

		int[] primeSum = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			int currentNumber = numbers[i];
			for(int j = 0; j<primeList.size(); j++) {
				int currentPrime = primeList.get(j);
				while (currentNumber % currentPrime == 0) {
					primeFactors.add(currentPrime);
					currentNumber /= currentPrime;
				}
			}
		}
		System.out.println("prime factors are : " + primeFactors);
		System.out.print("Sum of prime factors = ");
		int primeFactorSum = 0;
		for(int n : primeFactors) {
			primeFactorSum += n;
		}
		System.out.print(primeFactorSum);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
