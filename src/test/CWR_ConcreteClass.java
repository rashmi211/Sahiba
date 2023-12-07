package test;

public class CWR_ConcreteClass extends CWR_AbstractClass {

	@Override
	public void testA() {
		System.out.println("Method 1 of abstract class");
		
	}

	@Override
	public void testB() {
		System.out.println("Method 2 of abstract class");
		
	}
	
	public static void main(String[] args) {
		CWR_ConcreteClass ob=new CWR_ConcreteClass();
		ob.testC();
	}
	 
	
	
	

}
