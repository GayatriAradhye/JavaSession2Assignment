//initializing value to zero, passing single parameter in constructor, passing three parameters
package overload.construcotr;

import java.util.Scanner;

public class BoxDemo {

	public static void main(String[] args) {
		Box Box1=new Box();
		System.out.println("Width is"+Box1.getWidth());
		System.out.println("Lenghtis"+Box1.getLength());
		System.out.println("Height is"+Box1.getHeight());
		//calling constructor with single parameter
		System.out.println("Finding the cube\n\n"+"Enter the value of side");
		Scanner input=new Scanner(System.in);
		double side=input.nextDouble();
		Box Box2=new Box(side);
		System.out.println("\n----The Cube of the Box is----\n"+Box2.cubeBox());
		Box Box3=new Box(25,10,5);
		System.out.println("\n----The Volume of the box is----\n"+Box3.volumeBox());
		//calling constructor with 3 parameters for differnt values
		Box Box4=new Box(10,15,5,5);
		System.out.println("\n----The result of the box is----\n"+Box4.volumeBox());
	}

}
