package test;

public class CWR_MethodOverloading {

	public void testA() {
	  System.out.println("Hi");	
	}
	
	public void testA(int num) {
	  System.out.println("My age is "+num);
	}
	
	public void testA(int num,int num2) {
	  System.out.println("Sum of two numbers"+ num + num2);
		
	}
	
	public void show() {
		System.out.println("Parent class");
	}
	
	public static void main(String[] args) {		
	CWR_MethodOverloading ny=new CWR_MethodOverloading();
	ny.testA(27);
		
		
	}

}
