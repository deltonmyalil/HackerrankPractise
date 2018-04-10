package array_hourglass_sum_hard;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[6][6];
		for (int i = 0; i < 6; i++) { //to input two dim array as space separated row and line separated column
			String[] aRowItems = scanner.nextLine().split(" ");

			for (int j = 0; j < 6; j++) {
				int aItem = Integer.parseInt(aRowItems[j].trim());
				a[i][j] = aItem;
			}
		}
		for (int i = 0; i < 6; i++) { //block to print 2d 6x6 array
			for (int j = 0; j < 6; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		} //no need to print as hackerrank will reject the output
		int sum = 0;
		int[][] submatrix = new int[3][3];
		int pivotI = 0, pivotJ = 0, maxSum = -2147483648;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				for (pivotI = 0; pivotI < 3; pivotI++) {
					for (pivotJ = 0; pivotJ < 3; pivotJ++) {
						submatrix[pivotI][pivotJ] = a[i + pivotI][j + pivotJ];
						sum += a[i + pivotI][j + pivotJ];
					}
				}
				sum = sum - (submatrix[1][0] + submatrix[1][2]);
//				System.out.println(sum); //return individual hourglass sums for each hourglass
				if (maxSum < sum) {
					maxSum = sum;
				}
				sum = 0;
			}
		}
		System.out.println(maxSum);
	}
}

/*
Failed test case
 0 -4 -6 0 -7 -6
-1 -2 -6 -8 -3 -1
-8 -4 -2 -8 -8 -6
-3 -1 -2 -5 -7 -4
-3 -5 -3 -6 -6 -6
-3 -6 0 -8 -6 -7

Expected output
-19
* */
/*
fixed problems with -ve number inputs by initializing maxSum to least number possible with int ie. -2147483648
 */