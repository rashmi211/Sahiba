package test;

public class CWR_BreaknContinue {
	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		//	System.out.println("Java is great");
//			if(i==2) {
//				System.out.println("Ending loop");
//				break;
//			}
//		}

		
		int j=0;
		while(j<10) {
			j++;
			if(j==5) {
				System.out.println("Ending loop");
				continue;
			}
			System.out.println(j);
		}
	
}}
