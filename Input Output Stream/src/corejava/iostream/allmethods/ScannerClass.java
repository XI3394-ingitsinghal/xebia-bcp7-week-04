package corejava.iostream.allmethods;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String Str = sc.next();

		System.out.println(n);
		System.out.println(Str);
		sc.close();
	}
}
