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
	}
}
