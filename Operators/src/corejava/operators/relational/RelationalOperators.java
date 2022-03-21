package corejava.operators.relational;

public class RelationalOperators {

	public static void main(String atgs[]) {
//		<,>
		if (6 > 3)
			System.out.println("6>3");
//	 	<= >=

		if (4 <= 4)
			System.out.println("4<=4");

//		instanceof

		RelationalOperators d = new RelationalOperators();
		System.out.println(d instanceof RelationalOperators);

//		==

		String s = "hello";
		String z = "hello";
		System.out.println(s == z);
//		!=
		System.out.println(s != z);
	}

}
