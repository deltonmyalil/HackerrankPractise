package MinMaxSubsetSum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static void miniMaxSum(int[] array) {
		Arrays.sort(array);
		long maxsum=0, minsum=0;
		for(int i=0; i<array.length; i++) {
			if(i<=array.length-2)
				minsum+=array[i];
			if(i>0)
				maxsum+=array[i];
		}
		System.out.println(minsum + " " + maxsum);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i].trim());
			arr[i] = arrItem;
		}

		miniMaxSum(arr);
	}
}
