package test;

import java.util.Scanner;

public class CWR_ConvertMarkstoPercentage {
	public static void main(String[] args) {
		

	//marks out of 100
	//marks from 5 subject
	
	Scanner sc=new Scanner(System.in);
    int sub1=sc.nextInt();
    int sub2=sc.nextInt();
    int sub3=sc.nextInt();
    int sub4=sc.nextInt();
    int sub5=sc.nextInt();
    int sum=sub1+sub2+sub3+sub4+sub5;
    float totalmarks=500.0f;
    
    float marks=sum*100/totalmarks;
    
    System.out.println("Percenatage "+marks);
    

}}
