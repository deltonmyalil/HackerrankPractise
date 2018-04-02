package time_conversion;
import java.util.Scanner;

public class Solution {

	static String timeConversion(String s) {
		String[] tempString = s.split(":");
		int hour = Integer.parseInt(tempString[0]);
		if(tempString[2].endsWith("PM") && hour != 12) {
			hour += 12;
			tempString[0] = String.valueOf(hour);
		}
		if(tempString[2].endsWith("AM") && hour ==12) {
			tempString[0] = "00";
		}
//		String returnString = tempString[0]+":"+tempString[1]+":"+tempString[2].substring(0,2);
		return tempString[0]+":"+tempString[1]+":"+tempString[2].substring(0,2);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		System.out.print("Enter time in hh:mm:ssAM (Or PM) format: ");
		String s = scan.nextLine();
//		String s = "07:05:45PM";
		String result = timeConversion(s);
		System.out.println(result);
//		bw.write(result);
//		bw.newLine();

//		bw.close();
	}
}
