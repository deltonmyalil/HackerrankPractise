package birthday_cake_candles;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	static int birthdayCakeCandles(int n, int[] ar) {
		int max = 0, count = 0, oldmax = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
			if (oldmax != max)
				count = 0;
			if (ar[i] == max)
				count++;
			oldmax = max;
		}
		return count;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		System.out.print("Enter age: ");
		int n = Integer.parseInt(scan.nextLine().trim());

		int[] ar = new int[n];
		System.out.println("Enter candle height - space separated:");
		String[] arItems = scan.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);

//		bw.write(String.valueOf(result));
//		bw.newLine();

//		bw.close();
	}
}
