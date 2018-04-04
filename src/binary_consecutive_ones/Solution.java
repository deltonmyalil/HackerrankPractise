package binary_consecutive_ones;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberBaseTen = scanner.nextInt();
		System.out.print("Enter decimal number: ");
		scanner.nextLine();
		ArrayList<Boolean> binaryArray = new ArrayList<>();
		while (numberBaseTen > 0) {
//			int remainder = numberBaseTen % 2;
			if (numberBaseTen % 2 == 0)
				binaryArray.add(false);
			else
				binaryArray.add(true);
			numberBaseTen /= 2;
		}
//		for (int i=0; i<binaryArray.size();i++) {
//			if(binaryArray.get(i))
//				System.out.print("1");
//			else
//				System.out.print("0");
//		} //printing binary representation in reverse
		int onesOccurence = 0;
		int maxOccurence = 0;
		for (int i = 0; i < binaryArray.size(); i++) {
			if (binaryArray.get(i)) { //one found at index i
				onesOccurence++;
			} else {
				if (maxOccurence < onesOccurence)
					maxOccurence = onesOccurence;
				onesOccurence = 0;
			}
			if (maxOccurence < onesOccurence)
				maxOccurence = onesOccurence;
		}
		System.out.println("Number of occurrences of consecutive ones is " + maxOccurence);
	}
}