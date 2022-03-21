package corejava.collections.hashset;

import java.util.HashSet;

public class SearchingNumber {
	public static void main(String[] args) {

		// Create a HashSet object called numbers
		HashSet<Integer> numbers = new HashSet<Integer>();

		// Add values to the set
		numbers.add(4);
		numbers.add(7);
		numbers.add(8);

		// Show which numbers between 1 and 10 are in the set
		for (int i = 1; i <= 10; i++) {
			if (numbers.contains(i)) {
				System.out.println(i + " Search Successful.");
			} else {
				System.out.println(i + " Sorry! not found");
			}
		}
	}
}
