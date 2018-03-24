package Trial;

import java.util.Scanner;

public class RandomSumTrial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double meal_cost = in.nextDouble();
		int tip_percent = in.nextInt();
		int tax_percent = in.nextInt();
		double tip = ((double)tip_percent/100)*meal_cost;
		double tax = ((double)tax_percent/100)*meal_cost;
		double total = meal_cost+tip+tax;
		System.out.println(Math.round(total));
		in.close();
	}
}