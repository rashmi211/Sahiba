package test;

public class CWR_StringMethods {
	public static void main(String[] args) {
		String s="Jack Parke r";
		String newName=s.replace(" ", "_");
		System.out.println(newName);
		
	//find double and triple spaces in a string
		String space="My name  is Rashmi     salunke";
		
		int n1=space.indexOf("  ");
		System.out.println(n1);
		int n2=space.indexOf("   ");
		System.out.println(n2);
		
	
		
		
		
	}
	
	
	

}
