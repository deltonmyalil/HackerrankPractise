package even_odd_string_split;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> inputStrings = new ArrayList<>();
//		System.out.println("Input number of test cases");
		int testCaseNumber = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < testCaseNumber; i++) {
//			System.out.println("Input teat case no. " + (i + 1));
			inputStrings.add(scanner.nextLine());
		}
//		inputStrings.add("Hacker");
//		inputStrings.add("Rank");
		//took input
		for (int i = 0; i < testCaseNumber; i++) {
			String tempString = inputStrings.get(i);
			for(int j=0; j<tempString.length(); j+=2) {
				System.out.print(tempString.charAt(j));
			}
			System.out.print(" ");
			for(int j=1; j<tempString.length(); j+=2) {
				System.out.print(tempString.charAt(j));
			}
			System.out.println();
			/*char[] tempCharArray = inputStrings.get(i).toCharArray();
			String evenIndex = new String();
			String oddIndex = new String();
			for (int j = 0; j < tempCharArray.length; j++) {
				if (j % 2 == 0) {
					evenIndex.concat(String.valueOf(tempCharArray[j]));
					evenIndex.
//					System.out.print(String.valueOf(tempCharArray[j]));
//					System.out.println(evenIndex);
				} else {
					oddIndex.concat(String.valueOf(tempCharArray[j]));
//					System.out.println(tempCharArray[j]);
//					System.out.println(oddIndex);
				}
			}*//*
			System.out.println(evenIndex + "here " + oddIndex);*/
		}
	}
}


