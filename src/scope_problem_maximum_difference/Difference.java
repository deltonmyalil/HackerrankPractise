package scope_problem_maximum_difference;

import java.util.ArrayList;

public class Difference {
	private int[] elements;
	public int maximumDifference;

	//here
	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int greatest = -999999999;
		int smallest = 999999999;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] > greatest) greatest = elements[i];
			if (elements[i] < smallest) smallest = elements[i];
		}
		maximumDifference = greatest - smallest;
	}
}