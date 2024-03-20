package in.cdac;

import java.util.Scanner;

public class Vehicle {
	String type;
	String model;
	float price;

	public void display(String type) {
		System.out.println("Type: " + type);
	}

	public void display(String type, String model) {
		System.out.println("Type: " + type + " Model: " + model);
	}

	public void display(String type, String model, float price) {
		System.out.println("Type: " + type + " Model: " + model + " Price: " + price);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle v1 = new Vehicle();
		System.out.println("Enter type, model and price for vehicle ");
		v1.type = sc.nextLine();
		v1.model = sc.nextLine();
		v1.price = sc.nextFloat();

		v1.display(v1.type);
		v1.display(v1.type, v1.model);
		v1.display(v1.type, v1.model, v1.price);

	}

}
