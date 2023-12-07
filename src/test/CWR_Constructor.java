package test;

public class CWR_Constructor {
	int num=10;
	
	public CWR_Constructor() {
		System.out.println("Default constructor");
	}
	
	public CWR_Constructor(int num) {
		System.out.println("Parameterized constructor");
	}
	
	public void test1() {
		System.out.println("hi");
	}
	
	public void test1(int num) {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
	 CWR_Constructor ob=new CWR_Constructor(5);
		
		
	
}
}