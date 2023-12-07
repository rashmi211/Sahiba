package test;

public class CWR_MethodOverriding extends CWR_MethodOverloading {
	
	public void testB(int n) {
		System.out.println("I am implemented in child class "+n);
	}
	public int testC(int n,int n2) {
		return (n+n2);
	}
	
	public void show() {
		super.show();
		this.testA();
	}
	public static void main(String[] args) {
	CWR_MethodOverloading ob=new CWR_MethodOverriding();
	ob.testA(28);
	ob.show();
		
	}

}
