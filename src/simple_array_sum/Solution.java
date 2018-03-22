package simple_array_sum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum+=ar[i];
		}
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}
}
