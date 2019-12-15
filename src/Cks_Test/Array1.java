package Cks_Test;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] c1= {"Aaryan21","Kumar","Singh"};
		c1[2]="Aaryan1";
	/*	c1[4]="Kumar2";
		c1[5]="Singh3";
		c1[3]="Sunita";*/
		System.out.println(c1.length);
	/*	for(int i=0;i<c1.length;i++) {
			System.out.println(c1[i]);
		}*/
		for(String x:c1) {
			System.out.println(x);
		}
		

		
	}

}
