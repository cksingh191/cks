package Cks_Test;

class P{
	P(){
	System.out.println("parent");
	}
}
class C1 extends P{
	C1(){
	System.out.println("Child");
	}
}
public class Test {

	public static void main(String[] args) {
		C1 c1=new C1();

	}

}
