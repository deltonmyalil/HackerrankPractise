package aaaTrial;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scanner.nextInt();
		scanner.nextLine();
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				System.out.println("composite");
				break;
			}
		}
		if (flag == true) System.out.println("prime");
	}
}
