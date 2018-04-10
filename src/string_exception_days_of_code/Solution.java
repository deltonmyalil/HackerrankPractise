package string_exception_days_of_code;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int x;
		try {
			x = Integer.parseInt(S);
			System.out.println(x);
		} catch(Exception e){
			System.out.println("Bad String");
		}
	}
}
