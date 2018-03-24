package StairCasePattern;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the staircase function below.
	 */
	static void staircase(int n) {
		/*

		00 01 02 03
		10 11 12 13
		20 21 22 23
		30 31 32 33

		*/
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j<=n-i-2)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println();
		}

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		staircase(n);
	}
}
