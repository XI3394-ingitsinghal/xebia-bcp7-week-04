package corejava.operators.conditional;

public class AssignmentOperators {
	public static void main(String args[]) {
//		=
		int c = 3;
//		+=
		System.out.println(c += 4);
//		-=
		System.out.println(c -= 3);
//		*=
		System.out.println(c *= 2);
//		/=
		System.out.println(c /= 2);
//		%=
		System.out.println(c %= 3);
//		&=
		int f = 5;
		System.out.println(f &= 3);// 101 & 011 = 001
//		^=
		System.out.println(f ^= 4);// 001 ^ 100 = 101
//		|=
		System.out.println(f |= 9);// 0101 | 1000 =1101
//		<<=
		System.out.println(f <<= 2);// 1101 <<= 110100
//		>>=
		System.out.println(f >>= 3);// 110100 >>= 110
	}

}
