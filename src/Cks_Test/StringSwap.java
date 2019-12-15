package Cks_Test;

public class StringSwap {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		int l=a.length()-b.length();
		a=a.substring(b.length());
		System.out.println(l);
		System.out.println(b.length());
		System.out.println("A-- "+ a);
		System.out.println("B-- "+ b);
	}

}
