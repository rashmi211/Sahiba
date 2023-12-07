package test;

import java.util.Scanner;

public class CWR_PracticeInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int n3=sc.nextInt();
//		int n4=sc.nextInt();
//		
//		int sum=n1+n2;
//		int num=n3+n4;
//		int summation = sum+num;
//	
//		System.out.println(sum);
//		System.out.println(num);
//		System.out.println(summation);
		
		String name=sc.nextLine();
		System.out.println("My name is "+name);
		
		boolean surname=sc.hasNext();
		System.out.println(surname);
		
	}

}
