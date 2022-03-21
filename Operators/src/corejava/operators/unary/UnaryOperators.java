package corejava.operators.unary;

public class UnaryOperators {
	public static void main(String args[]) {
		int i = 39;
		System.out.println(i++);

//		expr--
		i = 21;
		System.out.println(i--);

//		++expr
		i = 23;
		System.out.println(++i);
//		--expr
		i = 24;
		System.out.println(--i);
//		+expr
		i = 67;
		System.out.println(+i);
//		-expr 
		i = 14;
		System.out.println(-i);
//		~ 
		i = 54;
		System.out.println(~i);
//		!
		boolean x = true;
		System.out.println(!x);

	}
}