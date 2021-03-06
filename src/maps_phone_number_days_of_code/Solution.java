package maps_phone_number_days_of_code;
//https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phonebook = new HashMap<>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phonebook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if (phonebook.containsKey(s)) {
				System.out.println(s + "=" + phonebook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
