package very_big_sum;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the aVeryBigSum function below.
	 */
	static long aVeryBigSum(int n, long[] ar) {
		/*
		 * Write your code here.
		 */
		long sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum+= ar[i];
		}

		return sum;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		System.out.print("Enter number of numbers: ");
		int n = Integer.parseInt(scan.nextLine().trim());

		long[] ar = new long[n];
		System.out.print("Enter the numbers separated by spaces: ");
		String[] arItems = scan.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++) {
			long arItem = Long.parseLong(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		long result = aVeryBigSum(n, ar);
		System.out.println(result);

//		bw.write(String.valueOf(result));
//		bw.newLine();

//		bw.close();
	}
}
