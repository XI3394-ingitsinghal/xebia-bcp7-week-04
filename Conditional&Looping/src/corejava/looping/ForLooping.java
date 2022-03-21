package corejava.looping;

public class ForLooping {
	public static void main(String args[]) {
		for (int num = 1; num <= 5; num++) {
			System.out.println(num);
		}

		String array[] = { "Ron", "Harry", "Hermoine" };

		// enhanced for loop
		for (String x : array) {
			System.out.println(x);
		}
	}

}
