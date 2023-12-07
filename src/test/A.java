package test;

public class A {
	
	
	static void change(int i) {
		int a=96;
		
	}
	static void change2(int []ar) {
		ar[0]=90;
		
	}
	void test1() {
		
	}
	public static void main(String[] args) {
		int n[]= {10,12,13,14,16,53};
		//Case 1 : changing the integer
//		int x=15;
//		change(x);
//		System.out.println("value of x after running change is "+ x);
//		
		
		
		//Case 2 : changing the integer
		change2(n);//object adderess will be shared
		System.out.println("value of x after running change is "+ n[0]);
	
	
	}
}