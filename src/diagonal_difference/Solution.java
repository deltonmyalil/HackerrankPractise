package diagonal_difference;

import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the diagonalDifference function below.
	 */
	static int diagonalDifference(int[][] a) {
		/*
		 * Write your code here.
		 */
		int n = a.length;
		int i,j;
		i=0;
		j=n-1;
		int leftDiag = 0;
		int rightDiag = 0;
		while(i<n && j>=0) {
			leftDiag+=a[i][i];
			rightDiag+=a[i][j];
			i++;
			j--;
		}

		int result = leftDiag - rightDiag;
		if(result<0)
			result = result*-1;

		return result;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		System.out.println("Enter matrix order");
		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		System.out.println("Enter matrix row by row, each elements in row separated by space and each row separated by newline");
		for (int aRowItr = 0; aRowItr < n; aRowItr++) {
			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;
			}
		}

		int result = diagonalDifference(a);
//		System.out.println(result);

		bw.write(String.valueOf(result));
		bw.newLine();

		bw.close();
	}
}
