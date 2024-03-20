package in.cdac;

import java.util.Scanner;

public class Employee {
	String name;
	int empid;
	float salary;

	public void showData(String name) {
		System.out.println("Name: " + name);
	}

	public void showData(String name, int empid) {
		System.out.println("Name: " + name + " Employee ID: " + empid);
	}

	public void showData(String name, int empid, float salary) {
		System.out.println("Name: " + name + " Employee ID: " + empid + " Salary: " + salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter Name, Employee ID and Salary ");
		e1.name = sc.nextLine();
		e1.empid = sc.nextInt();
		e1.salary = sc.nextFloat();

		e1.showData(e1.name);
		e1.showData(e1.name, e1.empid);
		e1.showData(e1.name, e1.empid, e1.salary);

	}

}
