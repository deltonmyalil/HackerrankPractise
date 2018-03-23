package encryption_string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String encryption(String s) {
		s = s.replace(" ","");
		int length = s.length();
		double rootLength = Math.sqrt(length);
		int ceilRootLength = (int)Math.ceil(rootLength); //8
		int floorRootLength = (int)Math.floor(rootLength); //7
		char[] charArray = s.toCharArray();
		char[][] resultCharArray = new char[floorRootLength][ceilRootLength];
		int k = 0;
		for(int i=0; i<floorRootLength && k<charArray.length; i++) {
			for(int j=0; j<ceilRootLength && k<charArray.length; j++) {
				resultCharArray[i][j] = charArray[k];
				k++;
			}
		}
//		System.out.println("Encrypting");
		k=0;
		ArrayList<Character> linearEncrypted = new ArrayList<>();
		for(int j=0; j<ceilRootLength; j++) {
			for(int i=0; i<floorRootLength; i++) {
				if(resultCharArray[i][j] != '\0' && k<length) {
					k++;
					linearEncrypted.add(resultCharArray[i][j]);
					System.out.print(resultCharArray[i][j]);
				}
			}
			linearEncrypted.add(' ');
			System.out.print(" ");
		}

		/*for(int i=0; i<7; i++)
		{for(int j=0; j<8; j++)
			System.out.print(resultCharArray[i][j]);
			System.out.println();}*/

		String resultString = resultCharArray.toString().substring(0,0);
//		char[] anotherChar = new char[resultString.length()+floorRootLength];

		return resultString;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
		String s = "if man was meant to stay on the ground god would have given us roots";
		String result = encryption(s);
//		System.out.println(result);
		in.close();
	}
}
