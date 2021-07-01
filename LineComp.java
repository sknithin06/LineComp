package Java;
import java.util.*;  
public class LineComp {
	public static void main(String[] args) {
		System.out.println("Welcome to line Problem ");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter first number- ");  
		double x1=sc.nextInt();  
		System.out.print("Enter second number- ");  
		double x2=sc.nextInt();  
		System.out.print("Enter third number- ");  
		double y1= sc.nextInt();  
		System.out.print("enter fourth number-");
		double y2= sc.nextInt();
		double p = 2;
		double x= Math.pow((x2 - x1),p) + Math.pow((y2- y1),p);
		System.out.println(Math.sqrt(x));
		
		System.out.print("Enter first number- ");  
		double a1=sc.nextInt();  
		System.out.print("Enter second number- ");  
		double a2=sc.nextInt();  
		System.out.print("Enter third number- ");  
		double b1= sc.nextInt();  
		System.out.print("enter fourth number-");
		double b2= sc.nextInt();
		System.out.print("Enter first number- ");  
		double c1=sc.nextInt();  
		System.out.print("Enter second number- ");  
		double c2=sc.nextInt(); 
		if ( (a1 / a2 == b1 / b2)
				&& (b1 / b2 == c1 / c2)
				&& (a1 / a2 == c1 / c2) ) 
			System.out.println("Lines are identical");
		else
			System.out.println("Lines are not identical");
		
		
	}
}
