package test;

public class CWR_DecrementLoop {
    int num=45;
    public String name="Rashmi";
    
	private void testA() {
		System.out.println("I am method testA");
	}
	
	public void testB() {
		num=10*2;
		System.out.println(num);
	}
	
	static void testC() {
		System.out.println("I am static method");
	}
	
	public static void main(String[] args) {
	  CWR_DecrementLoop ob=new CWR_DecrementLoop();
	   System.out.println("I am under main method");
	   System.out.println(ob.name);
	   System.out.println(ob.num);
	   ob.testB();
	   System.out.println(ob.num);
	   
	   CWR_DecrementLoop.testC();
	   
   }}