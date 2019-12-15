package Cks_Test;

public class Test21 {
	String name="Aryan";
	static int age=3;

	public static void main(String[] args) {
		
		
		Test21 t=new Test21();
		System.out.println(Test21.age);
		System.out.println(t.age);
		System.out.println(age);
		System.out.println(t.name);
		sum();
		t.sum();
		Test21.sum();

	}
	
	public static void sum() {
		System.out.println("static method");
	}

}
