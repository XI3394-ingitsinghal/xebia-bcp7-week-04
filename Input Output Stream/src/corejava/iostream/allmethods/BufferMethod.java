package corejava.iostream.allmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferMethod {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();

		System.out.println(num);
		System.out.println(str);
	}
}