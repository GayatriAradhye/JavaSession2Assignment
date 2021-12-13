//find the area of rectangle.Find are area of circle 1.r=base,2.r=height;
package method.overload;
import java.util.Scanner;
public class MethodOverloadAssignment {
	//Method to multiply two numbers
		public static double area(double m1,double m2){
			double R=m1*m2;
			return R;
		}
		//method to multiply three numbers
		public static double area(double m1,double m2,double m3) {
			double C=m1*m2*m3;
			return C;
		}
		public static void main(String[] args) {
			System.out.println("\nEnter the Base");
		Scanner input = new Scanner(System.in);
		double base=input.nextDouble();
	System.out.println("\nEnter the Height ");
	double height=input.nextDouble();
	double pie = 3.14;
	System.out.println("Area of rectangle is ");
	double Rectangle = area(base,height);
	System.out.println(Rectangle+ "square feet\n\n");
	System.out.println("Area of circle with base  as parameter is");
	double Circle1 = area(pie,base,base);
	System.out.println(Circle1+"\n\n");
	System.out.println("Area of circle with height  as parameter is");
	double Circle2 = area(pie,height,height);
	System.out.println(Circle2);

	}

	}