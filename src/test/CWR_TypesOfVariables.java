package test;

public class CWR_TypesOfVariables {
	
	static int num1=10;
	private int num2=15;
	
	public void testA() {
		num2=10;
		System.out.println(num2*2);
	}
	
	public void testB() {
		System.out.println(num1+num2);//you can call static/nonstatic global var to nanstatic method
	}
	
	public static void testC() {
		System.out.println(num1);
	}
	
	public void testD() {
		System.out.println("see if value changes to 10 for num2 "+ num2);
	}
	
	public static void main(String[] args) {
		CWR_TypesOfVariables po=new CWR_TypesOfVariables();
		po.testA();
		po.testD();
	
	}

}
