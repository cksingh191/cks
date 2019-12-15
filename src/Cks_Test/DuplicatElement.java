package Cks_Test;

public class DuplicatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Chandrashekhar Singh";
		String [] arr=s.split(" ");
		
		System.out.println(arr[1] +" "+ arr[0] );
		
		
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev + s.charAt(i);
	}
		System.out.println(rev);
	}
	
}
