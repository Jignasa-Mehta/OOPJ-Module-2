import java.util.*;
class Exercise {

public static void main(String[] args) {
		
Scanner sc= new Scanner (System.in); 
System.out.println("Enter Height in meter:");
double height=sc.nextDouble();

System.out.println("Enter Weight in Kg:");
double weight=sc.nextDouble();
double h=height*height;
double bmi= weight/h;
if (bmi>16 && bmi<18.5) {
	System.out.println("Underweight");
}
else if(bmi>18.25 && bmi<25){
	System.out.println("Normal (healthy weight)");
	}
	else if(bmi>25){
		System.out.println("Overweight");
	}
}
}