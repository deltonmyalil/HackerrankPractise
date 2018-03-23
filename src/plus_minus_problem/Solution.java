package plus_minus_problem;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the plusMinus function below.
	 */
	static void plusMinus(int[] arr) {
		/*
		 * Write your code here.
		 */
		int plus, minus, zero;
		float len;
		plus = minus = zero =0;
		len = arr.length;
		for(int i=0;i<len; i++) {
			if(arr[i] > 0)
				plus++;
			else if(arr[i] == 0)
				zero++;
			else
				minus++;
		}
		float plusRatio, minusRatio, zeroRatio;
		plusRatio = plus/len;
		minusRatio = minus/len;
		zeroRatio = zero/len;
		System.out.println(plusRatio);
		System.out.println(minusRatio);
		System.out.println(zeroRatio);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Number of numbers: ");
		int n = 6;//Integer.parseInt(scan.nextLine().trim());

		int[] arr = new int[n];
		System.out.println("Enter numbers separated by spaces: ");
		String[] arrItems = /*scan.nextLine()*/"-4 3 -9 0 4 1\n".split(" ");
		for (int arrItr = 0; arrItr < n; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		plusMinus(arr);
	}
}
