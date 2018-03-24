package ExtraLargeFactorials;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static void extraLongFactorials(int n) {
		// Complete this function
		BigInteger num = new BigInteger("1");
		for(int i=2; i<=n; i++) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
//		System.out.print("Enter Num: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		extraLongFactorials(n);
		in.close();
	}
}
