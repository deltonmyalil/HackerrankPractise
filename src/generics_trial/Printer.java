package generics_trial;

public class Printer <T> {
	/**
	 *    Method Name: printArray
	 *    Print each element of the generic array on a new line. Do not return anything.
	 **/
	public void printArray(T[] array) {
		for(T item : array) {
			System.out.println(item);
		}
	}
}
