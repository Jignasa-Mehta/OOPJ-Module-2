package in.cdac;

import java.util.Scanner;

public class Student {
	 String name;
	 int rollno;
	 int std;
	 float marks;
	 
	public static void main(String[] args) {
	Student s1=new Student();
	s1.name="Jignasa";
	s1.rollno=45;
	s1.std=12;
	s1.marks=525;
	System.out.println("Name:  "+s1.name);
	System.out.println("Roll No.:  "+s1.rollno);
	System.out.println("Standard:  "+s1.std);
	System.out.println("Marks:  "+s1.marks);
	}

}
