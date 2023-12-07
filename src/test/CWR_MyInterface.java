package test;

public interface CWR_MyInterface {
	int num=10;
	
	void call();
	
	public int sum();
	
	default void call2() {
		System.out.println("Hi");
	}
	
	 default void call3() {
		System.out.println("Hello");
	}
	 
	 public static void main(String[] args) {
		
		 
		 
		 
	}

}
