/*  Wap that creates a class student with variables rollno, name,
 sub1, sub2, sub3 & total. Create method that will find 
 percentage of student. */ 

import java.io.*;

public class STUDENT{
	int rollNo;
	String name;
	int sub1,sub2,sub3,total=0;
	public static void main(String args[]) throws Exception{
		STUDENT s = new STUDENT();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your roll no: ");
		s.rollNo = Integer.parseInt(br.readLine());

		System.out.println("Enter your name: ");
		s.name = br.readLine();

		System.out.println("sub1 marks: ");
		s.sub1 = Integer.parseInt(br.readLine());

		System.out.println("sub2 marks: ");
		s.sub2 = Integer.parseInt(br.readLine());

		System.out.println("sub3 marks: ");
		s.sub3 = Integer.parseInt(br.readLine());	

		s.total=s.sub1+s.sub2+s.sub3;	

		System.out.println("----------------------");
		System.out.println("Roll no : "+s.rollNo);
		System.out.println("Name : "+s.name);
		System.out.println("Sub1 : "+s.sub1);
		System.out.println("Sub2 : "+s.sub2);
		System.out.println("Sub3 : "+s.sub3);
		System.out.println("Total : "+s.total);
		System.out.println("----------------------");

		Percentage(s.total);
	}
	static void Percentage(int t){
		int p;
		p=t/3;
		System.out.println("percentage : "+p+"%");
	}
}